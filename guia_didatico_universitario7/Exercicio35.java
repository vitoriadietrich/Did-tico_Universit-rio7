// Exercicio 35: Consumidor Idempotente
import java.util.*;

public class Exercicio35 {
    private static Set<String> processados = new HashSet<>();

    public static void processar(String eventoId) {
        if (!processados.add(eventoId)) {
            System.out.println("Evento ja processado. Ignorando.");
            return;
        }
        System.out.println("Processando evento " + eventoId);
    }
}