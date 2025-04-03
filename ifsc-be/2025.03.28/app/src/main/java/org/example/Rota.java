package org.example;

import com.sun.net.httpserver.HttpExchange;

import java.net.URI;

public class Rota {
    private URI uri;
    private String metodo;
    private Object handler;

    public boolean executa(HttpExchange httpExchange){

        return true;
    }
}
