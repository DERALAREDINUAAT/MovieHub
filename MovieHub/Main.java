public class Main {

    public static void main(String[] args) {

        MovieService service = new MovieService();

        Movie m1 = new Movie("Inception", 2010, Genre.SCI_FI, 148);
        Series s1 = new Series("Dark", 2017, Genre.DRAMA, 3);

        Actor a1 = new Actor("Leonardo DiCaprio", 49);
        Director d1 = new Director("Christopher Nolan");

        User u1 = new User("alex");

        Review r1 = new Review(u1, m1, 10, "Very good movie");

        Watchlist w1 = new Watchlist(u1);

        service.addMovie(m1);
        service.addSeries(s1);
        service.addActor(a1);
        service.addDirector(d1);
        service.addUser(u1);
        service.addReview(r1);

        w1.addProduction(m1);
        w1.addProduction(s1);

        service.showMovies();
        service.showSeries();
        service.searchProduction("Dark");
        service.showReviews("Inception");

        w1.showWatchlist();
        service.showTitlesSorted();
    }
}