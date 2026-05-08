package ex20260.pregunta2;

public class MongoDatabase {
    public void openConnection() {
        System.out.println("Conectado a MongoDB");
    }

    public void saveDocument(String dato) {
        System.out.println("Guardando en MongoDB: " + dato);
    }
}
