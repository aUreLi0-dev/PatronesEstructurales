package Abstract;

public class SistemaBanco {
    private Tarjeta tarjeta;
    private Cuenta cuenta;
    private Prestamo prestamo;

    public SistemaBanco(RedPago factory) {
        this.tarjeta = factory.crearTarjeta();
        this.cuenta = factory.crearCuenta();
        this.prestamo = factory.crearPrestamo();
    }

    public void usar() {
        tarjeta.mostrar();
        cuenta.abrirCuenta();
        prestamo.solicitar();
    }


}
