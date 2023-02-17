package pizzaStore.store;

import pizzaStore.ingredient.IngredientFactory;
import pizzaStore.ingredient.NYIngredientFactory;
import pizzaStore.menu.CheesePizza;
import pizzaStore.menu.Pizza;
import pizzaStore.menu.PizzaType;
import pizzaStore.menu.VeggiePizza;

public class NYPizzaStore extends PizzaStore{

    private final IngredientFactory factory = new NYIngredientFactory();

    @Override
    public Pizza createPizza(PizzaType type) {
        return switch(type) {
            case Cheese -> new CheesePizza(factory);
            case Veggie -> new VeggiePizza(factory);
        };
    }
}
