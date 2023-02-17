package pizzaStore.ingredient;

public interface IngredientFactory {

    String makeDough();
    String makeSauce();
    String makeVeggie();
    String makeCheese();
    String getCity();
}
