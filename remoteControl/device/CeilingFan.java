package remoteControl.device;

public class CeilingFan {

    private static Speed speed;

    public CeilingFan() {
        speed = Speed.OFF;
    }

    public void high() {
        speed = Speed.HIGH;
        printSpeed();
    }

    public void medium() {
        speed = Speed.MEDIUM;
        printSpeed();
    }

    public void low() {
        speed = Speed.LOW;
        printSpeed();
    }

    public void off() {
        speed = Speed.OFF;
        printSpeed();
    }

    public Speed getSpeed() {
        return speed;
    }

    private void printSpeed() {
        System.out.println("speed: " + speed);
    }

    public enum Speed {
        OFF(0),
        LOW(1),
        MEDIUM(2),
        HIGH(3);

        private final int value;

        Speed(int value) {
            this.value = value;
        }
    }
}
