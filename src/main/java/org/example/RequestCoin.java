package org.example;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestCoin {

    public Coin coinRequest(String base_code, String target_code, String conversion_result) {
        //Base code = valor de referencia para a moeda
        URI adress = URI.create("https://v6.exchangerate-api.com/v6/" +
                "4c75abebcbf24a8f7bc13a23/pair/"
                + base_code + "/" + target_code + "/" + conversion_result);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(adress)
                .build();
        try {
            HttpResponse<String> send = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(send.body(), Coin.class);
        } catch (IOException | InterruptedException e) {
            System.out.println("Não foi possível obter o valor, tente novamente");
            throw new RuntimeException(e);
        }
    }
}
