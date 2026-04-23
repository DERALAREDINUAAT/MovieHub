import java.util.ArrayList;
import java.util.List;

public class Watchlist {

    private User user;
    private List<Production> productions;

    public Watchlist(User user) {
        this.user = user;
        this.productions = new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    public List<Production> getProductions() {
        return productions;
    }

    public void addProduction(Production production) {
        productions.add(production);
    }

    public void showWatchlist() {
        System.out.println("Watchlist for " + user.getUsername());

        for (Production p : productions) {
            System.out.println(p);
        }
    }
}