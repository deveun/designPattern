package simUduck.behavior.quack;

// QuackBehavior의 특정 행동을 구체화한 클래스
// --> 오리는 "꽥꽥"
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
