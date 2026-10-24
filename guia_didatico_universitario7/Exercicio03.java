// Exercicio 3: PasswordEncoder com BCrypt
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Exercicio03 {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hash = encoder.encode("senha123");
        System.out.println("Hash: " + hash);
        System.out.println("Valido? " + encoder.matches("senha123", hash));
    }
}