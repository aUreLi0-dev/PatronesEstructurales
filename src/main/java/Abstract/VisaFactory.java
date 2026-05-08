package Abstract;

public class VisaFactory extends RedPago{
    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaVisa();
    }

    @Override
    public Cuenta crearCuenta() {
        return new CuentaVisa();
    }

    @Override
    public Prestamo crearPrestamo() {
        return new PrestamoVisa();
    }
}
