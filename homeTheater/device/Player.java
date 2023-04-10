package homeTheater.device;

public class Player {

    public void on() {
        System.out.println("플레이어 On");
    }

    public void play(String movieName) {
        System.out.println("영화 \"" + movieName + "\" 재생");
    }

    public void stop() {
        System.out.println("영화 정지");
    }

    public void off() {
        System.out.println("플레이어 Off");
    }
}
