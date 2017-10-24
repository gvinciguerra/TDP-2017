public class FrenchCdPlayer extends CdPlayer {
    public FrenchCdPlayer(String description, Amplifier amplifier) {
        super(description, amplifier);
    }

    public void on() {
        System.out.println(description + " allumé");
    }

    public void off() {
        System.out.println(description + " éteindre");
    }

    public void eject() {
        title = null;
        System.out.println(description + " éjecter");
    }

    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " joue \"" + title + "\"");
    }

    public void play(int track) {
        if (title == null) {
            System.out.println(description + " ne peut pas lire " + currentTrack + 
                ", aucun cd inséré");
        } else {
            currentTrack = track;
            System.out.println(description + " joue la chanson " + currentTrack);
        }
    }

    public void stop() {
        currentTrack = 0;
        System.out.println(description + " arrêtée");
    }

    public void pause() {
        System.out.println(description + " en pause \"" + title + "\"");
    }
}
