package org.example;

import com.sun.net.httpserver.HttpServer;
import org.example.handlers.BaseHandler;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MeuServer {
    HttpServer srv;

    public MeuServer(InetSocketAddress address, String root_path) throws IOException{
        srv = HttpServer.create(address, 0);
        BaseHandler baseHandler = new BaseHandler();
        Rota r1 = new Rota("/receitas/", "GET", new HandleObtemReceita());



        base_handler.adiciona_rota(r1);

        srv.createContext("/", baseHandler);
    }

    public void start(){
        srv.start();
    }
}
