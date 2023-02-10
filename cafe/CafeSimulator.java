package cafe;

import cafe.beverage.Beverage;
import cafe.beverage.Espresso;
import cafe.beverage.HouseBlend;
import cafe.condiment.Milk;
import cafe.condiment.Mocha;
import cafe.condiment.Whip;

public class CafeSimulator {

    public static void main(String[] args) {

        // Whip double Mocha Espresso
        Beverage drink1 = new Whip(new Mocha(new Mocha(new Espresso())));
        System.out.println(drink1.getDescription() + ": " + drink1.cost() + " ₩");

        // Whip Mocha Milk HouseBlend
        Beverage drink2 = new Whip(new Mocha(new Milk(new HouseBlend())));
        System.out.println(drink2.getDescription() + ": " + drink2.cost() + " ₩");
    }
}
