package adapter.lab04;

public class Main {
        public static void main(String[] args) {
            PaymentService service = new PaymentService();

            MercadoPagoAPI mercadoPagoAPI = new MercadoPagoAPI();
            PaymentProcessor mercadoPago = new MecadoPagoAdapter(mercadoPagoAPI);

            StripeAPI stripeAPI = new StripeAPI();
            PaymentProcessor stripe = new StripeAdapter(stripeAPI);

            PayPalAPI payPalAPI = new PayPalAPI();
            PaymentProcessor paypal = new PayPalAdapter(payPalAPI);

            service.processPayment(mercadoPago,100);
            service.processPayment(stripe,180);
            service.processPayment(paypal,230);
        }
}
