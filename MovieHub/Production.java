public class Production {

    protected String title;
    protected int releaseYear;
    protected Genre genre;

    public Production(String title, int releaseYear, Genre genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return title + " (" + releaseYear + ") - " + genre;
    }
}