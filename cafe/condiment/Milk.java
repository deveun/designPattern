package cafe.condiment;

import cafe.beverage.Beverage;

public class Milk extends CondimentDecorator{

    private final String name = "Milk";
    private final double price = 1.0;

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + name;
    }

    @Override
    public double cost() {
        return beverage.cost() + price;
    }
}
