package factory.extra;

public class BoletaFactory extends ComprobanteFactory{
    @Override
    public Comprobante crear() {
        return new Boleta();
    }
}
