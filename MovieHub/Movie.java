public class Movie extends Production {

    private int duration;

    public Movie(String title, int releaseYear, Genre genre, int duration) {
        super(title, releaseYear, genre);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Movie: " + title + " - " + duration + " min";
    }
}