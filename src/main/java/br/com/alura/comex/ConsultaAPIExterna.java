package br.com.alura.comex;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
    public class ConsultaAPIExterna {


        public static void main(String[] args) {
            // Cria um cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Define a URI da API que queremos consultar
            String uri = "https://fakestoreapi.com/products/1";

            // Cria uma requisição HTTP GET com a URI especificada
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .build();

            try {
                // Envia a requisição e obtém a resposta
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // Verifica se a resposta foi bem-sucedida (código de status 200)
                if (response.statusCode() == 200) {
                    // Imprime o corpo da resposta
                    System.out.println("Resposta da API:");
                    System.out.println(response.body());
                } else {
                    // Se a resposta não foi bem-sucedida, imprime o código de status
                    System.out.println("Erro ao consultar a API. Código de status: " + response.statusCode());
                }
            } catch (Exception e) {
                // Se ocorrer uma exceção durante a consulta, imprime o erro
                System.out.println("Erro ao consultar a API: " + e.getMessage());
            }
        }
    }


