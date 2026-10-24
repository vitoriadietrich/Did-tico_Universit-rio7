// Exercicio 37: Cache Stampede Mitigation com Jitter
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio37 {
    public static int getTtlComJitter() {
        return 300 + ThreadLocalRandom.current().nextInt(0, 60); // 300 a 360s
    }
    public static void main(String[] args) {
        System.out.println("TTL com jitter: " + getTtlComJitter() + "s");
    }
}