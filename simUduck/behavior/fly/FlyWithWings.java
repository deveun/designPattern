package simUduck.behavior.fly;

// FlyBehavior의 특정 행동을 구체화한 클래스
// --> 날수 있는 경우
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
