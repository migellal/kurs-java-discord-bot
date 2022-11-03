package pl.michalgellert.advanced;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Scanner;

public class NetworkTester {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();

        HttpClient httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        String url = "https://openlibrary.org/search/authors.json?q=" + URLEncoder.encode(author, StandardCharsets.UTF_8);
        URI uri = URI.create(url);

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        String body = response.body();
        System.out.println(body);

        String numFoundStr = body.substring(body.indexOf(":") + 2, body.indexOf(","));
        int numFound = Integer.parseInt(numFoundStr);
        if(numFound>0) {
            String fragment = body.substring(body.indexOf("top_work") + 12);
            String title = fragment.substring(0, fragment.indexOf("\","));
            System.out.println(title);
        }
        else {
            System.out.println("Nic nie znaleziono");
        }


    }
}
