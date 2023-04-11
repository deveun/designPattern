package caffeineBeverage;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("(공통) 물을 끓임");
    }

    // tea <-> coffee 로직이 다르기 때문에 subclass에서 구현
    public abstract void brew();

    public void pourInCup() {
        System.out.println("(공통) 컵에 음료를 따름");
    }

    // tea <-> coffee 로직이 다르기 때문에 subclass에서 구현
    // 단, 기본적인 내용을 구현하여 subclass에서 선택해서 구현할 수 있음
    // 후크 (hook)
    public void addCondiments() {
        System.out.println("(hook) 설탕을 넣음");
    }
}
