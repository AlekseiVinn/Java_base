package syntax;

import java.time.Duration;

public class Song {

    private Jengre jengre;
    private String title;
    private String artist;
    private Duration duration;

    public Song(){}

    public Song(Jengre jengre, String title, String artist, long minutes, long seconds ) {
        this.jengre = jengre;
        this.title = title;
        this.artist = artist;
        this.duration = Duration.ofMinutes(minutes);
        this.duration = duration.plusSeconds(seconds);
    }

    public Jengre getJengre() {
        return jengre;
    }

    public void setJengre(Jengre jengre) {
        this.jengre = jengre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString()
    {
        String result;
        if (this.duration == null){
            result = String.format("Песня: %s,\n" +
                            "Исполнитель: %s,\n" +
                            "Жанр: %s,\n" +
                            "Длительность: %d.", this.title, this.artist, this.jengre, this.duration);
        } else {
            result = String.format("Песня: %s,\n" +
                            "Исполнитель: %s,\n" +
                            "Жанр: %s,\n" +
                            "Длительность: %d мин. %d сек.", this.title, this.artist, this.jengre,
                    this.duration.toMinutesPart(),
                    this.duration.toSecondsPart());
        }
        return  result;
    }
}
