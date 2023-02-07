package simUduck.model.species;

import simUduck.behavior.fly.FlyWithWings;
import simUduck.behavior.quack.Quack;
import simUduck.model.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings(); // 날 수 있음
        quackBehavior = new Quack(); // Quack 울음소리
    }

    @Override
    public void display() {
        System.out.println("I'm a MallardDuck");
    }
}
