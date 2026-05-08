package ex20260.pregunta2;

public class MySQLDatabase {
    public void connect() {
        System.out.println("Conectado a MySQL");
    }

    public void insert(String dato) {
        System.out.println("Insertando en MySQL: " + dato);
    }
}
