package cafe.beverage;

public class HouseBlend implements Beverage {

    private final double price = 4.0;

    @Override
    public String getDescription() {
        return "[HouseBlend]";
    }

    @Override
    public double cost() {
        return price;
    }
}
