package adapter.lab04;

public class PaymentService {
    public void processPayment(PaymentProcessor processor, double amount) {
        processor.pay(amount);
    }
}
