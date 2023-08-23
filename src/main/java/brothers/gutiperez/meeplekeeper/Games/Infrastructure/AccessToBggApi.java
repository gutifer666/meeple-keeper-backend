package brothers.gutiperez.meeplekeeper.Games.Infrastructure;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AccessToBggApi {
    private final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

    public String connectToBggApi(String url){
        final HttpRequest requestsPosts = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();
        final HttpResponse<String> response = httpClient.sendAsync(requestsPosts, HttpResponse.BodyHandlers.ofString())
                .join();
        return (response.body());
    }

}
