package adapter.lab04;

public class StripeAdapter implements PaymentProcessor{
    private StripeAPI stripeAPI;

    public StripeAdapter(StripeAPI stripeAPI) {
        this.stripeAPI = new StripeAPI();
    }


    @Override
    public void pay(double amount) {
        stripeAPI.makeCharge(amount);
    }
}
