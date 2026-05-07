package factory;

public class Docx extends Documento{

    @Override
    public void abrir() {
        System.out.println("Se abrira un documento de Word");

    }

    @Override
    public void cerrar() {
        System.out.println("Se cerrará un documento de Word");
    }
}
