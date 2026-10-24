// Exercicio 7: Dockerfile basico
public class Exercicio07 {
    public static void main(String[] args) {
        System.out.println("FROM eclipse-temurin:21-jre \n COPY app.jar app.jar \n ENTRYPOINT [\"java\", \"-jar\", \"app.jar\"]");
    }
}