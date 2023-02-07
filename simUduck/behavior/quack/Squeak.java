package simUduck.behavior.quack;

// QuackBehavior의 특정 행동을 구체화한 클래스
// --> 고무 오리는 "삑삑"
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak~~");
    }
}
