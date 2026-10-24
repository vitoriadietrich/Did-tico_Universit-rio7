// Exercicio 32: Teste de Seguranca Spring Security
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class Exercicio32 {
    @Autowired private MockMvc mvc;

    @Test
    void deveraRetornar401SemToken() throws Exception {
        mvc.perform(get("/api/protegido")).andExpect(status().isUnauthorized());
    }
}