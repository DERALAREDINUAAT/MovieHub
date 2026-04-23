public class Review {

    private User user;
    private Production production;
    private int rating;
    private String comment;

    public Review(User user, Production production, int rating, String comment) {
        this.user = user;
        this.production = production;
        this.rating = rating;
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public Production getProduction() {
        return production;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return user.getUsername() + " rated " + rating + " for " +
                production.getTitle() + " - " + comment;
    }
}