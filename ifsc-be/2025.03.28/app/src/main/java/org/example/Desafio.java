package org.example;

import com.sun.net.httpserver.HttpServer;
import org.example.exemplo.MeuHandler;

import java.net.InetSocketAddress;

public class Desafio {
    public static void main(String[] args) throws Exception {
        // Cria um servidor HTTP, que recebe requisições em localhost no port 8080 (e com backlog 0)

        String domain = "localhost";
        int port = 8080;
        HttpServer srv = HttpServer.create(new InetSocketAddress(domain, port), 0);
        // Cria um contexto para processar requisições em URIs iniciadas com "/"
        // O tratador de requisições é um objeto MeuHandler
        srv.createContext("/", new Handler());
        System.out.printf("INICIANDO SERVIDOR... %s %d \n", domain, port);
        // Executa o servidor HTTP
        srv.start();
    }
}
