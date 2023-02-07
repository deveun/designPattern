package simUduck.behavior.fly;

// FlyBehavior의 특정 행동을 구체화한 클래스
// --> 날 수 없는 경우
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
