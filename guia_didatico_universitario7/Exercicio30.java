// Exercicio 30: @CacheEvict ao atualizar produto
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
public class Exercicio30 {
    @CacheEvict(value = "produtos", key = "#id")
    public void atualizarProduto(Long id, String novoNome) {
        System.out.println("Produto atualizado e cache limpado.");
    }
}