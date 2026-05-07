package Decorator.lab04;

public class FraudCheckDecorator extends PaymentDecorator{
    public FraudCheckDecorator(PaymentProcessor decorator) {
        super(decorator);
    }

    public boolean checkFraud(double amount) {
        if (amount > 1000) {
            return true;
        }
        return false;
    }

    @Override
    public void pay(double amount) {
        if (checkFraud(amount)) {
            System.out.println("⚠ Revisando posible fraude...");
        }
        super.pay(amount);
    }
}
