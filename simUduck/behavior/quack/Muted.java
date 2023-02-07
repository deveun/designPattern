package simUduck.behavior.quack;

// QuackBehavior의 특정 행동을 구체화한 클래스
// --> 소리를 낼 수 없는 경우
public class Muted implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("... (Muted)");
    }
}
