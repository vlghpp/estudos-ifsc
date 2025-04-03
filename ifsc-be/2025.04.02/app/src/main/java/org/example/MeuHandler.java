package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MeuHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String requestedPath = exchange.getRequestURI().getPath();
        Path filePath = Paths.get("home/aluno", requestedPath);

        if (Files.exists(filePath) && !Files.isDirectory(filePath)) {
            String contentType = Files.probeContentType(filePath);
            exchange.getResponseHeaders().set("Content-Type", contentType != null ? contentType : "application/octet-stream");
            byte[] fileBytes = Files.readAllBytes(filePath);
            exchange.sendResponseHeaders(200, fileBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(fileBytes);
            }
        } else {
            Path notFoundPath = Paths.get("www", "notfound.html");
            String contentType = Files.probeContentType(notFoundPath);
            exchange.getResponseHeaders().set("Content-Type", contentType != null ? contentType : "text/html");
            byte[] fileBytes = Files.readAllBytes(notFoundPath);
            exchange.sendResponseHeaders(404, fileBytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(fileBytes);
            }
        }
    }
}