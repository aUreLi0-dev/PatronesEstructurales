package factory;

public class Presentador extends Aplicacion{
    @Override
    public Documento crear() {
        return new Pptx();
    }
}
