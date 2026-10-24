// Exercicio 20: Configurar Caffeine Cache com TTL
import com.github.benmanes.caffeine.cache.Caffeine;
import java.time.Duration;

public class Exercicio20 {
    public static void main(String[] args) {
        var cache = Caffeine.newBuilder().expireAfterWrite(Duration.ofMinutes(5)).maximumSize(100).build();
        cache.put("1", "Produto A");
        System.out.println("Cached: " + cache.getIfPresent("1"));
    }
}