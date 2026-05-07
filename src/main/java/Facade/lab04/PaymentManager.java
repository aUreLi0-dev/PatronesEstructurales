package Facade.lab04;

public class PaymentManager {
    PaymentGateway gateway;
    PaymentValidator validator;
    NotificationService notificationService;

    public PaymentManager() {
        this.gateway = new PaymentGateway();
        this.validator = new PaymentValidator();
        this.notificationService = new NotificationService();
    }

    public void pay(double amount){
        gateway.process(amount);
        validator.validate(amount);
        notificationService.sendReceipt(amount);
    }

}
