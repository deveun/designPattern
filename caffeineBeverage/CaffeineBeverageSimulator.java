package caffeineBeverage;

public class CaffeineBeverageSimulator {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        System.out.println("--- 티 만들기 ---");
        tea.prepareRecipe();
        System.out.println("--- 커피 만들기 ---");
        coffee.prepareRecipe();
    }
}
