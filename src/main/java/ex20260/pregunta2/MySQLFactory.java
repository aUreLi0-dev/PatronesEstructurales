package ex20260.pregunta2;

public class MySQLFactory extends DatabaseFactory{
    @Override
    public Database createDatabase() {
        return new MySQLAdapter();
    }
}
