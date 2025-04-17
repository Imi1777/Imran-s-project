import java.util.Arrays;

import components.soccer.Match;
import components.soccer.SoccerLive;
import components.soccer.SoccerLive1;

public class SoccerLiveResults {

        public static void main(String[] args) {

                SoccerLive gameCollection = new SoccerLive1();

                // Create some matches and add the players
                Match match1 = new Match("Man Utd", "Man City",
                                Arrays.asList("Rashford", "Bruno", "Casemiro",
                                                "Shaw", "Dalot", "Martinez",
                                                "Varane", "Eriksen", "Antony",
                                                "Onana"),
                                Arrays.asList("Haaland", "De Bruyne", "Silva",
                                                "Walker", "Stones", "Dias",
                                                "Rodri", "Foden", "Ederson",
                                                "Grealish"),
                                4, 2);

                Match match2 = new Match("Man Utd", "Man City",
                                Arrays.asList("Rashford", "Bruno", "Casemiro",
                                                "Shaw", "Dalot", "Martinez",
                                                "Varane", "Eriksen", "Antony",
                                                "Onana"),
                                Arrays.asList("Haaland", "De Bruyne", "Silva",
                                                "Walker", "Stones", "Dias",
                                                "Rodri", "Foden", "Ederson",
                                                "Grealish"),
                                3, 1);

                Match match3 = new Match("Man Utd", "Man City",
                                Arrays.asList("Rashford", "Bruno", "Casemiro",
                                                "Shaw", "Dalot", "Martinez",
                                                "Varane", "Eriksen", "Antony",
                                                "Onana"),
                                Arrays.asList("Haaland", "De Bruyne", "Silva",
                                                "Walker", "Stones", "Dias",
                                                "Rodri", "Foden", "Ederson",
                                                "Grealish"),
                                2, 2);

                Match match4 = new Match("Man Utd", "Man City",
                                Arrays.asList("Rashford", "Bruno", "Casemiro",
                                                "Shaw", "Dalot", "Martinez",
                                                "Varane", "Eriksen", "Antony",
                                                "Onana"),
                                Arrays.asList("Haaland", "De Bruyne", "Silva",
                                                "Walker", "Stones", "Dias",
                                                "Rodri", "Foden", "Ederson",
                                                "Grealish"),
                                4, 3);

                Match match5 = new Match("Man Utd", "Man City",
                                Arrays.asList("Rashford", "Bruno", "Casemiro",
                                                "Shaw", "Dalot", "Martinez",
                                                "Varane", "Eriksen", "Antony",
                                                "Onana"),
                                Arrays.asList("Haaland", "De Bruyne", "Silva",
                                                "Walker", "Stones", "Dias",
                                                "Rodri", "Foden", "Ederson",
                                                "Grealish"),
                                2, 1);

                // Add the matches to the collection
                gameCollection.addGame(match1);
                gameCollection.addGame(match2);
                gameCollection.addGame(match3);
                gameCollection.addGame(match4);
                gameCollection.addGame(match5);

                // Show the starting 11 for both teams from the first match
                System.out.println("Starting 11 - Man Utd: "
                                + match1.team1Players());
                System.out.println("Starting 11 - Man City: "
                                + match1.team2Players());

                // keeps to track who wins
                int utdWins = 0;
                int cityWins = 0;
                int draws = 0;

                // Count the wins for each team
                for (Match match : gameCollection) {
                        if (match.team1Score() > match.team2Score()) {
                                utdWins++;
                        } else if (match.team1Score() < match.team2Score()) {
                                cityWins++;
                        } else {
                                draws++;
                        }
                }

                // Print the results
                System.out.println("Man Utd Wins: " + utdWins);
                System.out.println("Man City Wins: " + cityWins);
                System.out.println("Draws: " + draws);

                if (utdWins > cityWins) {
                        System.out.println("Man Utd won the most matches!");
                } else if (cityWins > utdWins) {
                        System.out.println(" Man City won the most matches!");
                } else {
                        System.out.println(" It was a tie overall!");
                }
        }

}
