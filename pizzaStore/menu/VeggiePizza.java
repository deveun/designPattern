package pizzaStore.menu;

import pizzaStore.ingredient.IngredientFactory;

public class VeggiePizza extends Pizza{

    public VeggiePizza(IngredientFactory factory) {
        super("CheesePizza", factory);
    }

    @Override
    public void prepare() {
        dough = factory.makeDough();
        sauce = factory.makeSauce();
        veggie = factory.makeVeggie(); // veggie
    }
}
