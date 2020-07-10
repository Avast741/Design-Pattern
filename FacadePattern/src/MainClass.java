import Component.*;

public class MainClass {
    public static void main(String[] args) {
        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheatreLights(),
                new Screen(),
                new PopcornPopper());
        System.out.println("Welcome to The Home Theatre!");
        System.out.println("The film that has been prepared for you is titled Avengers");
        System.out.println("Let's play the movie!");
        theaterFacade.watchMovie("Avengers");
        theaterFacade.endMovie();
    }
}
