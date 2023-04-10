package homeTheater;

import homeTheater.device.Amplifier;
import homeTheater.device.Player;
import homeTheater.device.PopcornPopper;
import homeTheater.device.Projector;
import homeTheater.device.Screen;

public class HomeTheaterFacade {

    private final Amplifier amp;
    private final Player player;
    private final PopcornPopper popcorn;
    private final Projector projector;
    private final Screen screen;

    // ....

    public HomeTheaterFacade(Amplifier amp, Player player, PopcornPopper popcorn,
            Projector projector, Screen screen) {
        this.amp = amp;
        this.player = player;
        this.popcorn = popcorn;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movieName) {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        amp.on();
        amp.setVolume(5);
        player.on();
        player.play(movieName);
    }

    public void endMovie() {
        popcorn.off();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
}
