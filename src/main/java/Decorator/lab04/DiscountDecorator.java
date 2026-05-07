package Decorator.lab04;

public class DiscountDecorator extends PaymentDecorator{
    private double discountRate;
    public DiscountDecorator(PaymentProcessor decorator, double discountRate) {
        super(decorator);
        this.discountRate = discountRate;
    }

    @Override
    public void pay(double amount) {
        double discountRate = amount * 0.9;
        super.pay(discountRate);
    }
}
