import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDeMoneda {

    private static final String API_KEY = "e954d86ceb60a271f99f5ddc";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";


    public static double consulta(String moneda, String monedaConvertida) throws Exception {
        String url = BASE_URL + moneda + "/" + monedaConvertida;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        Gson gson = new Gson();
        RespuestaDelCambio respuestaDelCambio = gson.fromJson(response.body(), RespuestaDelCambio.class);

        return respuestaDelCambio.tasaDeConversion;
    }

    public static double convertirMoneda(String moneda, String monedaConvertida, double monto) throws Exception {
        double tipoDeCambio = consulta(moneda, monedaConvertida);
        return monto * tipoDeCambio;

    }
}