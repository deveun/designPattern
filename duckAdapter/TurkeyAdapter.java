package duckAdapter;

import duckAdapter.duck.Duck;
import duckAdapter.turkey.Turkey;

/* 새로 추가할 Turkey 인터페이스를 기존의 Duck인터페이스에 맞춰주는 클래스 */
public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // + special logic for making Turkey flying like Duck
        System.out.print("Like Duck --> ");
        turkey.fly();
    }
}
