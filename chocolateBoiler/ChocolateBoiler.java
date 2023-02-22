package chocolateBoiler;

public class ChocolateBoiler {

    private static ChocolateBoiler instance;
    private boolean empty;
    private boolean boiled;

    public static ChocolateBoiler getInstance() { // 싱글톤 인스턴스를 가져오는 전역 메소드
        if (instance == null)
            instance = new ChocolateBoiler();
        return instance;
    }

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        System.out.println("newBoiler --> empty: " + empty + ", boiled: " + boiled);
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            // ... 비어있는 boiler에 초콜렛 재료를 넣어줌
            System.out.println("fill --> empty: " + empty + ", boiled: " + boiled);
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            // ... 재료로 초콜릿 만들고 boiler를 비움
            empty = true;
            System.out.println("drain --> empty: " + empty);
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            // ... 재료를 끓임
            boiled = true;
            System.out.println("boil --> empty: " + empty + ", boiled: " + boiled);
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
