// Exercicio 18: RestClient para consumo HTTP
import org.springframework.web.client.RestClient;

public class Exercicio18 {
    public static void main(String[] args) {
        RestClient client = RestClient.create();
        System.out.println("RestClient criado com sucesso.");
    }
}