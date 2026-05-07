package Decorator.lab04;

public class BasicPayment implements PaymentProcessor{
    @Override
    public void pay(double amount) {
        System.out.println("Pagando: " + amount);
    }
}
