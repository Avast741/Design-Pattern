import Component.*;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheatreLights theatreLights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheatreLights theatreLights, Screen screen, PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theatreLights = theatreLights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("--The Popcorn Popper is Pop");
        popper.pop();
        System.out.println("--The Theatre Lights is On");
        theatreLights.on();
        System.out.println("--The Screen is On");
        screen.on();
        System.out.println("--The DVD Player is On");
        dvdPlayer.on();
        System.out.println("--The CD Player is On");
        cdPlayer.on();
        System.out.println("--The Tuner is On");
        tuner.on();
        System.out.println("--The Amplifier is On");
        amplifier.on();
        System.out.println("The Movie is Ready to Watch!");
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        popper.off();
        theatreLights.off();
        screen.off();
        dvdPlayer.off();
        cdPlayer.off();
        tuner.off();
        amplifier.off();
        dvdPlayer.off();
    }
}