package factory;

public class ProcesadorTexto extends Aplicacion{

    @Override
    public Documento crear() {
        return new Docx();
    }
}
