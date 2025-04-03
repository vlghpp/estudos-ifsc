package org.example.handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.example.Rota;

import java.io.IOException;
import java.util.ArrayList;

public class BaseHandler implements HttpHandler {
    ArrayList<Rota> rotas;

    public BaseHandler(){
        rotas = new ArrayList<>();
    }

    public void adiciona_rota(Rota r){
        rotas.add(r);
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
    for(Rota r: rotas){
        if(r.executa(req)) break;
    }
    }
}
