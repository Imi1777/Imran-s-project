import java.util.Arrays;
import java.util.List;

import components.sequence.Sequence;
import components.sequence.Sequence1L;
import components.sequence.Sequence2L;

public class ProofOfConcept {

    // TODO - what do you want to store?
    public record Game(String team1, String team2, int score, int score2) {
    }

    public record lineUp(String teamNames, String teamNames2,
            List<String> players1, List<String> player2) {

    }

    Sequence<Game> games;

    Sequence<lineUp> players;

    // TODO - how do we construct a ScoreTracker
    public ProofOfConcept() {
        this.games = new Sequence1L<>();
        this.players = new Sequence2L<>();
    }

    // TODO - Implement kernels
    public void addGame(Game game) {
        this.games.add(0, game);
    }

    public Game removeAnyGame() {
        return this.games.remove(0);
    }

    public int numberOfGames() {
        return this.games.length();
    }

    // TODO - show off secondary
    public String showAllGames() {
        String allGames = "";
        for (Game g : this.games) {
            allGames += g;
        }
        return allGames;
    }

    public static void main(String[] args) {
        ProofOfConcept gamesList = new ProofOfConcept();
        gamesList.addGame(new Game("Manchester United", "Chelsea", 17, 1));
        System.out.println(gamesList.showAllGames());

        //creat the player teams
        List<String> manUtdPlayers = Arrays
                .asList("Rashford, Onana, Bruno, Amad");
        List<String> chelseaPlayers = Arrays
                .asList("Palmer, Nkunku,Reece, Jackson");

        lineUp gameLinUp = new lineUp("Manchester United", "Chelsea",
                manUtdPlayers, chelseaPlayers);

        System.out.println(gameLinUp);
    }

}
