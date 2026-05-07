package adapter.lab04;

public class MecadoPagoAdapter implements PaymentProcessor{
    private MercadoPagoAPI mercadoPagoAPI;

    public MecadoPagoAdapter(MercadoPagoAPI mercadoPagoAPI) {
        this.mercadoPagoAPI = new MercadoPagoAPI();
    }

    @Override
    public void pay(double amount) {
        mercadoPagoAPI.pagar(amount);
    }
}
