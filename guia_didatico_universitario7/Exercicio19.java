// Exercicio 19: Consumidor RabbitMQ basico
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Exercicio19 {
    @RabbitListener(queues = "pedidos.v1")
    public void ouvir(String msg) {
        System.out.println("Mensagem recebida: " + msg);
    }
}