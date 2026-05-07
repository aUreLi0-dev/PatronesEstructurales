package Decorator.lab04;

public class PaymentWithLoggingAndDiscount implements PaymentProcessor{
    @Override
    public void pay(double amount) {
        System.out.println("[LOG] Iniciando pago...");
        double discounted = amount * 0.9;
        System.out.println("[LOG] Pago completado");
    }
}
