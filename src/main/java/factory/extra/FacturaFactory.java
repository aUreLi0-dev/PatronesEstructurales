package factory.extra;

public class FacturaFactory extends ComprobanteFactory{
    @Override
    public Comprobante crear() {
        return new Factura();
    }
}
