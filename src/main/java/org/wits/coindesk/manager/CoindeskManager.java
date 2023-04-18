package org.wits.coindesk.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@RequiredArgsConstructor
public class CoindeskManager {

    private static final String COINDESK_URL = "https://api.coindesk.com/v1/bpi/currentprice.json";

    public String callCoindesk() throws Exception {

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(COINDESK_URL))
            .version(HttpClient.Version.HTTP_2)
            .GET()
            .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
