package pizzaStore.ingredient;

public class ChicagoIngredientFactory implements IngredientFactory{

    @Override
    public String makeDough() {
        return "normal dough";
    }

    @Override
    public String makeSauce() {
        return "white sauce";
    }

    @Override
    public String makeVeggie() {
        return "fresh veggies";
    }

    @Override
    public String makeCheese() {
        return "chicagoCheese";
    }

    @Override
    public String getCity() {
        return "Chicago";
    }
}
