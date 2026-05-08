package ex20260.pregunta2;

public class MongoAdapter implements Database{
    private MongoDatabase mongoDatabase;

    public MongoAdapter() {
        this.mongoDatabase = new MongoDatabase();
    }

    @Override
    public void conectar() {
        mongoDatabase.openConnection();
    }

    @Override
    public void insertar(String dato) {
        mongoDatabase.saveDocument(dato);
    }
}
