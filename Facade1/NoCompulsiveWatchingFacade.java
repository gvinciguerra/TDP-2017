import java.util.*;
import java.time.*;

public class NoCompulsiveWatchingFacade extends HomeTheaterFacade {    
    private Map<String, Instant> watchedMovies = new HashMap<>();
    
    public NoCompulsiveWatchingFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, 
                             Projector projector, Screen screen, TheaterLights lights,
                             PopcornPopper popper) {
        super(amp, tuner, dvd, cd, projector, screen, lights, popper);
    }
    
    public void watchMovie(String movie) {
        Instant lastDay = Instant.now().minus(Period.ofDays(1));
        Instant lastSeen = watchedMovies.get(movie);
        if (lastSeen == null || lastSeen.isBefore(lastDay)) {
            super.watchMovie(movie);
            watchedMovies.put(movie, Instant.now());
        }
        else
            System.out.println(movie + " has already been seen in the last day.");
    }
}
