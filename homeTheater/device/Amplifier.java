package homeTheater.device;

public class Amplifier {

    public void on() {
        System.out.println("오디오 On");
    }

    public void setVolume(int i) {
        System.out.println("볼륨 " + i + "로 설정");
    }

    public void off() {
        System.out.println("오디오 Off");
    }
}
