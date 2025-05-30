package pbe;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.concurrent.*;

@RestController
public class SSEController {

    private final int max_len = 8;
    private ConcurrentMap<String,BlockingQueue<String>> cons = new ConcurrentHashMap<>();

    /*
    Publish a message, which must be in the body as String content
     */
    @PostMapping(value="/envia", produces="text/plain")
    public String publish(@RequestBody String msg) {
        // sends a copy of the message to each connected client
        // adds the message to the client's queue
        for (var q: cons.values()) {
            // if queue is full, drops the oldest content
            if (q.remainingCapacity() < 1) {
                q.poll();
            }
            q.add(msg);
        }
        return "done !";
    }

    /*
    Handles connection to the event service
    Starts a thread for each client. Each thread has a queue, which is also
    stored in the map "cons". The thread waits for content in the queue to emit
    an event. When connection closes, thread removes the queue from the map and terminates.
     */
    @GetMapping("/noticias")
    public SseEmitter streamSseEvents(HttpServletRequest request) {
        SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);
        // uses IP:port as an ID of this connection
        String addr = request.getRemoteAddr() + ":" + request.getRemotePort();
        // creates a queue and stores it in the map
        BlockingQueue<String> q = new ArrayBlockingQueue<>(max_len);
        cons.put(addr, q);

        // creates the thread
        Thread.ofVirtual().start(() -> {
            try {
                emitter.onCompletion(() -> {cons.remove(addr);});
                emitter.onError((e) -> {cons.remove(addr);});
                // forever waits for events to send to client ...
                while (true) {
                    String msg = q.take();
                    // envia o evento
                    var ev = SseEmitter.event().name("noticia").data(msg);
                    emitter.send(ev);
                }

            } catch (IOException | InterruptedException e) {
                emitter.completeWithError(e);
            }
        });
        return emitter;
    }
}