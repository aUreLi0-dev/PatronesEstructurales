package ex20260.pregunta2;

public class SistemaBackend {
    private Configuracion config;

    private FileLogger fileLogger;
    private CloudLogger cloudLogger;

    private MySQLDatabase mysql;
    private MongoDatabase mongo;

    public SistemaBackend() {

        config = Configuracion.getInstance("PRODUCCION");

        fileLogger = new FileLogger();
        cloudLogger = new CloudLogger();

        mysql = new MySQLDatabase();
        mongo = new MongoDatabase();
    }

    public void iniciar() {

        fileLogger.writeLog("Sistema iniciado");

        cloudLogger.save("Backend funcionando");

        mysql.connect();
        mysql.insert("usuario");

        mongo.openConnection();
        mongo.saveDocument("documento");
    }
}
