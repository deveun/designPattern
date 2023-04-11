package caffeineBeverage;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("찻잎을 우려냄");
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬을 추가");
    }
}
