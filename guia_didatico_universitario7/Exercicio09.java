// Exercicio 9: @Cacheable no Spring Boot
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Exercicio09 {
    @Cacheable("produtos")
    public String buscarProduto(Long id) {
        return "Produto " + id;
    }
}