package duckAdapter.duck;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("QUACK");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck is flying!");
    }
}
