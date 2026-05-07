package singleton.extra;

public class Logger {
    private static Logger instance = null;

public static Logger getInstance(){
    if(instance == null){
        instance = new Logger();
    }
    return instance;
}

    public void log(String mensaje) {
        System.out.println("[LOG] " + mensaje);
    }
}
