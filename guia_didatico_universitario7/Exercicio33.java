// Exercicio 33: HTTP Interface declarativa (Spring 6)
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("/clientes")
public interface Exercicio33 {
    @GetExchange("/{id}")
    String buscarCliente(@PathVariable("id") Long id);
}