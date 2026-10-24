// Exercicio 36: Outbox Pattern Tabela DTO
record OutboxEvento(Long id, String tipo, String payload, boolean processado) {}

public class Exercicio36 {
    public static void main(String[] args) {
        System.out.println("Salva pedido e evento de Outbox na mesma transacao de banco.");
    }
}