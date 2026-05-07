package Facade.lab04;

public class Client {
    public static void main(String[] args) {
        PaymentManager manager = new PaymentManager();
        double amount = 100;

        try {
            manager.pay(amount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
