// Exercicio 4: @PreAuthorize para regras de autorizacao por role
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class Exercicio04 {
    @PreAuthorize("hasRole('ADMIN')")
    public void deletarUsuario(Long id) {
        System.out.println("Usuario deletado.");
    }
}