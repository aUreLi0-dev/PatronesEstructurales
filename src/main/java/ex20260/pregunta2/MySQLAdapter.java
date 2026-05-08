package ex20260.pregunta2;

public class MySQLAdapter implements Database{
    private MySQLDatabase mySQLDatabase;

    public MySQLAdapter() {
        this.mySQLDatabase = new MySQLDatabase();
    }

    @Override
    public void conectar() {
        mySQLDatabase.connect();
    }

    @Override
    public void insertar(String dato) {
        mySQLDatabase.insert(dato);
    }
}
