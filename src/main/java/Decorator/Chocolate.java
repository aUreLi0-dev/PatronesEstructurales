package Decorator;

public class Chocolate extends BeverageDecorator{

    public Chocolate(String description, Beverage decorator) {
        super(description, decorator);
    }

    @Override
    public double cost() {
        return decorator.cost() + 4;
    }
}
