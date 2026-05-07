package factory.extra;

public class Ticket implements Comprobante{
    @Override
    public void generar() {
        System.out.println("Generando ticket...");

    }
}
