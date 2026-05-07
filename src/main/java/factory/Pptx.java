package factory;

public class Pptx extends Documento{
    @Override
    public void abrir() {
        System.out.println("Se abrira un documento de PowerPoint");
    }

    @Override
    public void cerrar() {
        System.out.println("Se cerrará un documento de PowerPoint");
    }
}
