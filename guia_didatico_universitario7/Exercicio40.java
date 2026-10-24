// Exercicio 40: Pipeline Tag da Imagem Docker
public class Exercicio40 {
    public static void main(String[] args) {
        System.out.println("docker build -t minha-api:${{ github.sha }} .");
    }
}