package factory;

public class Xlsx extends Documento{
    @Override
    public void abrir() {
        System.out.println("Se abrira un documento de Excel");
    }

    @Override
    public void cerrar() {
        System.out.println("Se cerrara un documento de Excel");
    }
}
