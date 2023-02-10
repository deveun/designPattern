package cafe.condiment;

import cafe.beverage.Beverage;

public class Mocha extends CondimentDecorator{

    private final String name = "Mocha";
    private final double price = 1.2;

    public Mocha(Beverage beverage) {
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
