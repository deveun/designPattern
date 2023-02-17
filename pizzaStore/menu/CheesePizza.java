package pizzaStore.menu;

import pizzaStore.ingredient.IngredientFactory;

public class CheesePizza extends Pizza{

    public CheesePizza(IngredientFactory factory) {
        super("CheesePizza", factory);
    }

    @Override
    public void prepare() {
        dough = factory.makeDough();
        sauce = factory.makeSauce();
        cheese = factory.makeCheese(); // cheese
    }
}
