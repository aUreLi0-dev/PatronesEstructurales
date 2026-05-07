package adapter.lab04;

public class PayPalAdapter implements PaymentProcessor{
    private PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = new PayPalAPI();
    }

    @Override
    public void pay(double amount) {
        payPalAPI.sendPayment(amount);

    }
}
