// Exercicio 12: Configurar API Stateless
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;

public class Exercicio12 {
    void config(HttpSecurity http) throws Exception {
        http.sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    }
}