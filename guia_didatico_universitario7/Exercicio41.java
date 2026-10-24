// Exercicio 41: Endpoint protegido com scopes
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class Exercicio41 {
    @PreAuthorize("hasAuthority('SCOPE_read')")
    @GetMapping("/api/pedidos")
    public String listar() { return "Lista de pedidos"; }
}