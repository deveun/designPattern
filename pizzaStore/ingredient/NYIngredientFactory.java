package pizzaStore.ingredient;

public class NYIngredientFactory implements IngredientFactory{

    @Override
    public String makeDough() {
        return "thin dough";
    }

    @Override
    public String makeSauce() {
        return "tomato sauce";
    }

    @Override
    public String makeVeggie() {
        return "iced veggies";
    }

    @Override
    public String makeCheese() {
        return "NY Cheese";
    }

    @Override
    public String getCity() {
        return "NewYork";
    }
}
