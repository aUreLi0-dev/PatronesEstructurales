package ex20260.pregunta2;

public class MongoFactory extends DatabaseFactory{
    @Override
    public Database createDatabase() {
        return new MongoAdapter();
    }
}
