package simUduck.model.species;

import simUduck.behavior.fly.FlyNoWay;
import simUduck.behavior.quack.Muted;
import simUduck.model.Duck;

// 장난감 오리
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Muted();
    }

    @Override
    public void display() {
        System.out.println("I'm a DecoyDuck");
    }
}
