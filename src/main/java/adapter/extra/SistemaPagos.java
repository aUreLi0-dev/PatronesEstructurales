package adapter.extra;

public class SistemaPagos {
    private PagosLib pagosLib;

    public SistemaPagos(PagosLib pagosLib) {
        this.pagosLib = pagosLib;
    }

    public void pagar(double monto) {
        pagosLib.hacerPago(monto);
    }
}
