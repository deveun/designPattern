package cafe.beverage;

public class Espresso implements Beverage{

    private final double price = 2.5;

    @Override
    public String getDescription() {
        return "[Espresso]";
    }

    @Override
    public double cost() {
        return price;
    }
}
