package adapter.extra;

public class PasarelaAdapter implements PagosLib{
    private PasarelaExterna pasarelaExterna;

    public PasarelaAdapter(PasarelaExterna pasarelaExterna) {
        this.pasarelaExterna = pasarelaExterna;
    }

    @Override
    public void hacerPago(double monto) {
        pasarelaExterna.makePayment(monto);
    }
}
