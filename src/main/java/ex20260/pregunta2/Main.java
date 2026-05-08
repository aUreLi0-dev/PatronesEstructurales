package ex20260.pregunta2;

public class Main {
    static void main() {
        DatabaseFactory databaseFactory = new MongoFactory();

        Database database = databaseFactory.createDatabase();

        database.conectar();
        database.insertar("hola");

    }
}
