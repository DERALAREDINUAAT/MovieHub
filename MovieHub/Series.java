public class Series extends Production {

    private int seasons;

    public Series(String title, int releaseYear, Genre genre, int seasons) {
        super(title, releaseYear, genre);
        this.seasons = seasons;
    }

    public int getSeasons() {
        return seasons;
    }

    @Override
    public String toString() {
        return "Series: " + title + " - " + seasons + " seasons";
    }
}