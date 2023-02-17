package pizzaStore.store;

import pizzaStore.ingredient.ChicagoIngredientFactory;
import pizzaStore.ingredient.IngredientFactory;
import pizzaStore.menu.CheesePizza;
import pizzaStore.menu.VeggiePizza;
import pizzaStore.menu.Pizza;
import pizzaStore.menu.PizzaType;

public class ChicagoPizzaStore extends PizzaStore{

    private final IngredientFactory factory = new ChicagoIngredientFactory();

    @Override
    public Pizza createPizza(PizzaType type) {
        return switch(type) {
            case Cheese -> new CheesePizza(factory);
            case Veggie -> new VeggiePizza(factory);
        };
    }
}
