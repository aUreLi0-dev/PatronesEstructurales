package Decorator.lab04;

public class LoggingDecorator extends PaymentDecorator {
    public LoggingDecorator(PaymentProcessor decorator) {
        super(decorator);
    }

    @Override
    public void pay(double amount) {
        System.out.println("[LOG] Iniciando pago...");
        super.pay(amount);
        System.out.println("[LOG] Pago completado");
    }
}
