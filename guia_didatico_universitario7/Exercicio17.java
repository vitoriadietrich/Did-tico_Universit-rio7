// Exercicio 17: Testcontainers com MySQL
import org.testcontainers.containers.MySQLContainer;

public class Exercicio17 {
    public static void main(String[] args) {
        try (var mysql = new MySQLContainer<>("mysql:8.4")) {
            mysql.start();
            System.out.println("MySQL Container JDBC URL: " + mysql.getJdbcUrl());
        }
    }
}