package Decorator;

public abstract class BeverageDecorator extends Beverage{
    protected Beverage decorator;

    public BeverageDecorator(String description, Beverage decorator) {
        super(description);
        this.decorator = decorator;
    }

    @Override
    public abstract double cost();
}
