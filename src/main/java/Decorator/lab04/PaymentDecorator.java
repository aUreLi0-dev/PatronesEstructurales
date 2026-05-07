package Decorator.lab04;

public abstract class PaymentDecorator implements PaymentProcessor{
    protected PaymentProcessor decorator;

    public PaymentDecorator(PaymentProcessor decorator) {
        this.decorator = decorator;
    }

    public void pay(double amount){
        decorator.pay(amount);
    }


}
