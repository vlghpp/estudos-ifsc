package org.example.exemplo;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Handler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String uri = httpExchange.getRequestURI().toString().substring(1);
        System.out.println("ESSA É A URI: " + uri);

        Path path = Paths.get("src/main/java/org/example/docs/" + uri);

        if (Files.exists(path)) {
            String content = Files.readString(path);

            OutputStream outputStream = httpExchange.getResponseBody();
            httpExchange.getRequestHeaders().add("Content-Type", "text/plain");//seugndo parametro seria o media type
            httpExchange.sendResponseHeaders(200, content.getBytes().length);

            outputStream.write(content.getBytes());
            outputStream.flush();
            outputStream.close();
        } else {
            String errorMessage = "Arquivo nao encontrado!";
            httpExchange.sendResponseHeaders(404, errorMessage.getBytes().length);
            OutputStream outputStream = httpExchange.getResponseBody();
            outputStream.write(errorMessage.getBytes());
            outputStream.flush();
            outputStream.close();
        }
    }
}
