// Exercicio 14: DTO de Login e Request
record LoginRequest(String email, String senha) {}
record TokenResponse(String token) {}

public class Exercicio14 {
    public static void main(String[] args) {
        LoginRequest req = new LoginRequest("user@teste.com", "123");
        System.out.println("Login: " + req.email());
    }
}