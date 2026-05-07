package factory;

public class HojaCalculo extends Aplicacion{
    @Override
    public Documento crear() {
        return new Xlsx();
    }
}
