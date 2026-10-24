// Exercicio 26: Tratamento de Erros no RestClient
import org.springframework.web.client.RestClient;
import org.springframework.http.HttpStatusCode;

public class Exercicio26 {
    void buscar() {
        RestClient.create().get().uri("http://api.com").retrieve()
            .onStatus(HttpStatusCode::is4xxClientError, (req, resp) -> {
                throw new RuntimeException("Erro 4xx do cliente");
            });
    }
}