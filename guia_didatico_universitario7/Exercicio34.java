// Exercicio 34: WebClient chamadas paralelas
import reactor.core.publisher.Mono;

public class Exercicio34 {
    public static void main(String[] args) {
        Mono<String> m1 = Mono.just("Dados A");
        Mono<String> m2 = Mono.just("Dados B");
        Mono.zip(m1, m2).subscribe(t -> System.out.println(t.getT1() + " + " + t.getT2()));
    }
}