import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProofOfConcept {

    public record Match(String team1, String team2, List<String> team1Players,
            List<String> team2Players, int team1Score, int team2Score) {
    }

    private List<Match> games;

    public ProofOfConcept() {
        this.games = new ArrayList<>();
    }

    public void addGame(Match game) {
        this.games.add(0, game);
    }

    public Match removeAnyGame() {
        return this.games.remove(0);
    }

    public int numberOfGames() {
        return this.games.size();
    }

    public String showAllGames() {
        String allGames = "";
        for (Match g : this.games) {
            allGames += g;
        }
        return allGames;
    }

    public List<Match> getGames() {
        return this.games;
    }

    public static void main(String[] args) {
        ProofOfConcept gamesList = new ProofOfConcept();
        Match manUVsChelsea = new Match("Manchester United", "Chelsea",
                Arrays.asList("Rashford, Onana, Bruno, Amad"),
                Arrays.asList("Palmer, Nkunku,Reece, Jackson"), 17, 1);
        gamesList.addGame(manUVsChelsea);
        System.out.println(gamesList.showAllGames());

    }

}
