package Decorator;

public class Milk extends BeverageDecorator{

    public Milk(String description, Beverage decorator) {
        super(description, decorator);
    }

    @Override
    public double cost() {
        return decorator.cost() + 2;
    }
}
