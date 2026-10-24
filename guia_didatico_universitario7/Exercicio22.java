// Exercicio 22: Refresh Token DTO e Rotacao
record RefreshTokenRequest(String refreshToken) {}

public class Exercicio22 {
    public static void main(String[] args) {
        System.out.println("Ao renovar token, revogue o refresh token antigo e emita um novo par.");
    }
}