//package ads.sj.pbe;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//public class Main {
//    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//        HttpClient cliente = HttpClient.newHttpClient();
//
//
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(new URI("https://www.sigaa.com.br"))
//                .GET()
//                .build();
//
//        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.printf("Status: %d\n", response.statusCode());
//        System.out.printf("Versão: %s\n", response.version());
//        System.out.printf("Resposta prévia: %s\n", response.previousResponse());
//        System.out.printf("Titulo: %s\n", response.headers());
//        System.out.printf("Corpo: %s\n", response.body());
//
//    }
//
//}