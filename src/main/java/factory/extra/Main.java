package factory.extra;

public class Main {
    static void main() {
        ComprobanteFactory comprobanteFactory = new BoletaFactory();
        Comprobante comprobante = comprobanteFactory.crear();
        comprobante.generar();


    }
}
