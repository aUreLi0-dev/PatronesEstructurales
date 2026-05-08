package Abstract;

public class MastercardFactory extends RedPago{
    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaMastercard();
    }

    @Override
    public Cuenta crearCuenta() {
        return new CuentaMastercard();
    }

    @Override
    public Prestamo crearPrestamo() {
        return new PrestamoMastercard();
    }
}
