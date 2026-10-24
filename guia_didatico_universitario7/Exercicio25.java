// Exercicio 25: Testcontainers com Redis
import org.testcontainers.containers.GenericContainer;

public class Exercicio25 {
    public static void main(String[] args) {
        try (var redis = new GenericContainer<>("redis:7-alpine").withExposedPorts(6379)) {
            redis.start();
            System.out.println("Redis rodando na porta " + redis.getMappedPort(6379));
        }
    }
}