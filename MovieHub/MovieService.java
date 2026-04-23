import java.util.*;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();
    private List<Series> seriesList = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();

    private Map<String, Actor> actors = new HashMap<>();
    private TreeSet<String> titles = new TreeSet<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
        titles.add(movie.getTitle());
        System.out.println("Movie added.");
    }

    public void addSeries(Series series) {
        seriesList.add(series);
        titles.add(series.getTitle());
        System.out.println("Series added.");
    }

    public void addActor(Actor actor) {
        actors.put(actor.getName(), actor);
        System.out.println("Actor added.");
    }

    public void addDirector(Director director) {
        System.out.println("Director added: " + director.getName());
    }

    public void addUser(User user) {
        System.out.println("User added: " + user.getUsername());
    }

    public void addReview(Review review) {
        reviews.add(review);
        System.out.println("Review added.");
    }

    public void showMovies() {
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    public void showSeries() {
        for (Series s : seriesList) {
            System.out.println(s);
        }
    }

    public void searchProduction(String title) {
        for (Movie m : movies) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                System.out.println(m);
                return;
            }
        }

        for (Series s : seriesList) {
            if (s.getTitle().equalsIgnoreCase(title)) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Not found.");
    }

    public void showReviews(String title) {
        for (Review r : reviews) {
            if (r.getProduction().getTitle().equalsIgnoreCase(title)) {
                System.out.println(r);
            }
        }
    }

    public void showTitlesSorted() {
        System.out.println(titles);
    }
}