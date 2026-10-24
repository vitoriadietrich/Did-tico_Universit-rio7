// Exercicio 11: Configuração de CORS local
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.*;

public class Exercicio11 {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry reg) {
                reg.addMapping("/**").allowedOrigins("http://localhost:3000");
            }
        };
    }
}