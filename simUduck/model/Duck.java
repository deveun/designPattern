package simUduck.model;

import simUduck.behavior.fly.FlyBehavior;
import simUduck.behavior.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    } // 나는 행동을 다른 클래스에 위임

    public void performQuack() {
        quackBehavior.quack();
    } // 꽥꽥거리는 행동을 다른 클래스에 위임

    public abstract void display(); // 모든 오리 구현 클래스에서 다르게 정의되는 메소드

}
