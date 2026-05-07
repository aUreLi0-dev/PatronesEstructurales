package factory.extra;

public class Boleta implements Comprobante{
    @Override
    public void generar() {
        System.out.println("Generando boleta...");

    }
}
