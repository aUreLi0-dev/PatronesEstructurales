package Decorator.lab04;

public class Main {
        public static void main(String[] args) {
            PaymentProcessor basico = new BasicPayment();
            System.out.println("Pago Basico");
            basico.pay(100);

            PaymentProcessor pagoConLog = new LoggingDecorator(basico);
            System.out.println("\nPago con logging");
            pagoConLog.pay(100);

            PaymentProcessor pagoConDescuento = new DiscountDecorator(basico,0.1);
            System.out.println("\nPago con descuento");
            pagoConDescuento.pay(100);

            PaymentProcessor chequeoFraude = new FraudCheckDecorator(pagoConDescuento);
            System.out.println("\nPago con chequeo de fraude");
            chequeoFraude.pay(1500);


    }
}
