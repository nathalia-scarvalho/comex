package br.com.alura.comex;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
public class APIComURLDinamica {

        public static void main(String[] args) {
            // Cria um objeto Scanner para ler a entrada do teclado
            Scanner leitura = new Scanner(System.in);

            try {
                // Solicita ao usuário para digitar um número
                System.out.println("Digite um número:");

                // Lê o número digitado pelo usuário
                int numero;
                if (leitura.hasNextInt()) {
                    numero = leitura.nextInt();

                    // Constrói a URI com o número digitado pelo usuário
                    String uri = "https://fakestoreapi.com/products/" + numero;

                    // Cria um cliente HTTP
                    HttpClient client = HttpClient.newHttpClient();

                    // Cria uma requisição HTTP GET com a URI especificada
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(uri))
                            .build();

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
                } else {
                    System.out.println("Por favor, digite um número válido.");
                }
            } catch (Exception e) {
                // Se ocorrer uma exceção durante a consulta, imprime o erro
                System.out.println("Erro ao consultar a API: " + e.getMessage());
            } finally {
                // Fecha o objeto Scanner para liberar recursos
                leitura.close();
            }
        }
    }



