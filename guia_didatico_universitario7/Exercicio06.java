// Exercicio 6: Anotacao OpenAPI / Swagger em endpoint
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
public class Exercicio06 {
    @Operation(summary = "Busca item por ID")
    @GetMapping("/item/{id}")
    public String getItem(@PathVariable Long id) { return "Item " + id; }
}