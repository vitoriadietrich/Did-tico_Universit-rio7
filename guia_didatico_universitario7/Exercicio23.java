// Exercicio 23: Modelo de Erro Padrão DTO
record ErroResposta(int status, String mensagem, long timestamp) {}

public class Exercicio23 {
    public static void main(String[] args) {
        ErroResposta err = new ErroResposta(404, "Recurso nao encontrado", System.currentTimeMillis());
        System.out.println(err);
    }
}