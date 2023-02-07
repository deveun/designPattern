package simUduck.model.species;

import simUduck.behavior.fly.FlyNoWay;
import simUduck.behavior.quack.Squeak;
import simUduck.model.Duck;

// 고무 오리
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a RubberDuck");
    }
}
