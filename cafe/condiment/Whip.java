package cafe.condiment;

import cafe.beverage.Beverage;

public class Whip extends CondimentDecorator{

    private final String name = "Whip";
    private final double price = 0.5;

    public Whip(Beverage beverage) {
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
