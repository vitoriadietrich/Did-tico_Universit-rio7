// Exercicio 45: Circuit Breaker Fallback
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

public class Exercicio45 {
    @CircuitBreaker(name = "pagamento", fallbackMethod = "fallback")
    public String pagar() {
        throw new RuntimeException("Servico fora!");
    }

    public String fallback(Throwable t) {
        return "Pagamento indisponivel momento. Tente mais tarde.";
    }
}