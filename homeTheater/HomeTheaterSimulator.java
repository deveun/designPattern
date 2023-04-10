package homeTheater;

import homeTheater.device.Amplifier;
import homeTheater.device.Player;
import homeTheater.device.PopcornPopper;
import homeTheater.device.Projector;
import homeTheater.device.Screen;

public class HomeTheaterSimulator {

    public static Amplifier amp;
    public static Player player;
    public static PopcornPopper popcorn;
    public static Projector projector;
    public static Screen screen;

    public static void main(String[] args) {
        init();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, player, popcorn, projector, screen);

        System.out.println("--- watchMovie ---");
        homeTheater.watchMovie("Example1");
        System.out.println("--- endMovie ---");
        homeTheater.endMovie();
    }

    public static void init() {
        amp = new Amplifier();
        player = new Player();
        popcorn = new PopcornPopper();
        projector = new Projector();
        screen = new Screen();
    }
}
