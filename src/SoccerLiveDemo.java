import java.util.Arrays;

import components.soccer.Match;
import components.soccer.SoccerLive;
import components.soccer.SoccerLive1;

public class SoccerLiveDemo {
        public static void main(String[] args) {

                //Create a SoccerLive instance
                SoccerLive gameCollection = new SoccerLive1();

                // create some matches and add the players
                Match match1 = new Match("Man Utd", "Man City",
                                Arrays.asList("Rasford", "Bruno"),
                                Arrays.asList("Dias", "Halaand"), 4, 2);

                Match match2 = new Match("Man Utd", "Man City",
                                Arrays.asList("Rashford", "Bruno"),
                                Arrays.asList("Dias", "Haaland"), 3, 1);

                Match match3 = new Match("Man Utd", "Man City",
                                Arrays.asList("Rashford", "Bruno"),
                                Arrays.asList("Dias", "Haaland"), 2, 2);

                Match match4 = new Match("Man Utd", "Man City",
                                Arrays.asList("Rashford", "Bruno"),
                                Arrays.asList("Dias", "Haaland"), 4, 3);

                Match match5 = new Match("Man Utd", "Man City",
                                Arrays.asList("Rashford", "Bruno"),
                                Arrays.asList("Dias", "Haaland"), 2, 1);

                // Add the matches to the collection
                gameCollection.addGame(match1);
                gameCollection.addGame(match2);
                gameCollection.addGame(match3);
                gameCollection.addGame(match4);
                gameCollection.addGame(match5);

                // This show all games
                System.out.println("All Games: ");
                System.out.println(gameCollection.showAllGames());

                // This show the number of games
                System.out.println("Number of games: "
                                + gameCollection.numberOfGames());

                // Remove a game and show updated list
                System.out.println("Removing a game: ");
                gameCollection.removeAnyGame();

                // Show all games again after removal
                System.out.println("All Games after removal: ");
                System.out.println(gameCollection.showAllGames());

                //  Show the updated number of games
                System.out.println("Updated number of games: "
                                + gameCollection.numberOfGames());

        }
}
