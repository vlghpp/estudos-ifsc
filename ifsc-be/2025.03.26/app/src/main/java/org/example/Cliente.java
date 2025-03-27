package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Cliente {

    // envia uma mensagem, e espera uma repsosta, a qual é retornada como resultado

    static public HttpResponse<String> envia(String url)  {
        HttpClient cliente = HttpClient.newHttpClient();
        try{
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();
            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
            return response;
        }catch (URISyntaxException | IOException | InterruptedException e){
            System.out.println("Ocorreu um erro: " + e);
            return null;
        }
    }
}