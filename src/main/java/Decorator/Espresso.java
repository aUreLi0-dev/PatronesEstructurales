package Decorator;

public class Espresso extends Beverage {
    public Espresso(String description) {
        super(description);
    }


    @Override
    public double cost() {
        return 10;
    }
}
