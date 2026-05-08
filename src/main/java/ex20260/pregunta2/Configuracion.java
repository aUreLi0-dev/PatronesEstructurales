package ex20260.pregunta2;

public class Configuracion {
    private static Configuracion instance = null;

    private String entorno;

    private Configuracion(String entorno) {
        this.entorno = entorno;
    }

    public static Configuracion getInstance(String entorno){
        if(instance==null){
            instance = new Configuracion(entorno);
        }
        return instance;
    }

    public String getEntorno() {
        return entorno;
    }
}
