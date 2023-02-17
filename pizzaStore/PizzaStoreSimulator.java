package pizzaStore;

import pizzaStore.menu.PizzaType;
import pizzaStore.store.ChicagoPizzaStore;
import pizzaStore.store.NYPizzaStore;
import pizzaStore.store.PizzaStore;

public class PizzaStoreSimulator {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        nyPizzaStore.orderPizza(PizzaType.Cheese);
        chicagoPizzaStore.orderPizza(PizzaType.Cheese);
        chicagoPizzaStore.orderPizza(PizzaType.Veggie);
    }
}
