package pizzaStore.menu;

import pizzaStore.ingredient.IngredientFactory;

public abstract class Pizza {

    IngredientFactory factory;

    // 피자에 포함될 수 있는 모든 종류의 원재료
    // 피자의 동류에 따라서 재료를 set해서 사용
    private String name;
    String dough;
    String sauce;
    String veggie;
    String cheese;

    public Pizza(String name, IngredientFactory factory) {
        this.name = name;
        this.factory = factory;
    }

    public abstract void prepare(); // pizza 종류에 따라 달라짐. -> 오버라이드

    public void bake() {
        System.out.println("baking... " + dough + " & " + sauce);
    }

    public void cut() {
        System.out.println("cutting...");
    }

    public void box() {
        System.out.println("boxing...");
    }

    public void making() {
        prepare();
        bake();
        cut();
        box();
    }

    public String getName() {
        return name;
    }
    public String getCity() { return factory.getCity();}
}
