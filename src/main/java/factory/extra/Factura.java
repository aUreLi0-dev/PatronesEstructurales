package factory.extra;

public class Factura implements Comprobante{
    @Override
    public void generar() {
        System.out.println("Generando factura...");

    }
}
