package music;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import iTunes.SearchResult;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AlbumSearch implements Search<AlbumResult> {

    public AlbumSearch() {
        parameters = new ArrayList<>();
        parameters.add(new BasicNameValuePair("entity", "album"));
        client = HttpClient.newHttpClient();
    }

    String searchEndpoint = "https://itunes.apple.com/search";
    String lookupEndpoint = "https://itunes.apple.com/lookup";
    List<NameValuePair> parameters;
    HttpClient client;

    @Override
    public void setUp(Map<String, String> headers) {
        parameters.addAll(headers.entrySet()
                .stream()
                .map(entry -> new BasicNameValuePair(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList()));
    }

    @Override
    public AlbumResult search(String term)  {
        HttpGet httpGet = new HttpGet(searchEndpoint);

        URI uri = null;
        try {
            uri = new URIBuilder(httpGet.getURI())
                    .addParameters(parameters)
                    .addParameter("term", term)
                    .build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response =
                null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ObjectMapper mapper = new ObjectMapper();

        AlbumResult albumResult = new AlbumResult();
        try {
            albumResult = mapper.readValue(response.body(), AlbumResult.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return albumResult;
    }

    @Override
    public AlbumResult search(int id) {
        HttpGet httpGet = new HttpGet(lookupEndpoint);

        URI uri = null;
        try {
            uri = new URIBuilder(httpGet.getURI())
                    .addParameters(parameters)
                    .addParameter("id", Integer.toString(id))
                    .build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        HttpResponse<String> response =
                null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ObjectMapper mapper = new ObjectMapper();

        AlbumResult albumResult = new AlbumResult();
        try {
            albumResult = mapper.readValue(response.body(), AlbumResult.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return albumResult;
    }
}
