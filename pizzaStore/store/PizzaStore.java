package pizzaStore.store;

import pizzaStore.menu.Pizza;
import pizzaStore.menu.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        System.out.println("***** " + pizza.getCity() + " " + pizza.getName() + " *****");
        pizza.making();

        return pizza;
    }

    // factory method --> subclass 에서 결정됨
    public abstract Pizza createPizza(PizzaType type);
}
