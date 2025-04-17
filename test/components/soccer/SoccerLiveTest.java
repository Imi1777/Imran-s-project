package components.soccer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class SoccerLiveTest {

    @Test
    public void testAddGameAndNumberOfGames() {
        SoccerLive live = new SoccerLive1();

        Match match = new Match("Liverpool", "Chelsea",
                java.util.Arrays.asList("Salah", "Nunez"),
                java.util.Arrays.asList("Sterling", "Enzo"), 2, 2);

        live.addGame(match);

        assertEquals(1, live.numberOfGames());
    }

    @Test
    public void testAddMultipleGamesAndNumberOfGames() {
        SoccerLive live = new SoccerLive1();

        Match match1 = new Match("Liverpool", "Chelsea",
                java.util.Arrays.asList("Salah", "Nunez"),
                java.util.Arrays.asList("Sterling", "Enzo"), 2, 2);

        Match match2 = new Match("Arsenal", "Tottenham",
                java.util.Arrays.asList("Saka", "Odegaard"),
                java.util.Arrays.asList("Son", "Kane"), 3, 2);

        live.addGame(match1);
        live.addGame(match2);

        assertEquals(2, live.numberOfGames());
    }

    @Test
    public void testAddNoGamesAndNumberOfGames() {
        SoccerLive live = new SoccerLive1();

        // no games added
        assertEquals(0, live.numberOfGames());
    }

    @Test
    public void testRemoveAnyGame() {
        SoccerLive live = new SoccerLive1();

        Match match = new Match("Man Utd", "Man City",
                java.util.Arrays.asList("Rashford", "Bruno"),
                java.util.Arrays.asList("Haaland", "De Bruyne"), 2, 3);

        live.addGame(match);

        Match removed = live.removeAnyGame();

        // Check if the removed match is the one we added
        assertEquals(match, removed);

        // Now the number of games should be 0
        assertEquals(0, live.numberOfGames());
    }

    @Test
    public void testRemoveAnyGameMultiple() {
        // Two different matches
        SoccerLive live2 = new SoccerLive1();
        Match match1 = new Match("Barcelona", "Real Madrid",
                Arrays.asList("Yamal", "Pedri"),
                Arrays.asList("Vini", "Modric"), 1, 2);
        Match match2 = new Match("Bayern", "Dortmund",
                Arrays.asList("Kane", "Musiala"),
                Arrays.asList("Reus", "Brandt"), 3, 1);
        live2.addGame(match1);
        live2.addGame(match2);
        Match removed2 = live2.removeAnyGame();

        assertTrue(removed2.equals(match1) || removed2.equals(match2));
        assertEquals(1, live2.numberOfGames());
    }

    @Test(expected = AssertionError.class)
    public void testRemoveAnyGameEmpty() {
        SoccerLive live = new SoccerLive1();

        // no games added should throw an exception when removing
        live.removeAnyGame();
    }

    @Test
    public void clear() {
        SoccerLive live = new SoccerLive1();

        Match match1 = new Match("Man Utd", "Man City",
                java.util.Arrays.asList("Rashford", "Bruno"),
                java.util.Arrays.asList("Haaland", "De Bruyne"), 2, 3);

        Match match2 = new Match("Barcelona", "Real Madrid",
                java.util.Arrays.asList("Yamal", "De Jong"),
                java.util.Arrays.asList("Vini", "Mbappe"), 1, 1);

        live.addGame(match1);
        live.addGame(match2);

        // Clear the collection
        live.clear();

        // Verify the collection is empty
        assertEquals(0, live.numberOfGames());
    }

    @Test
    public void clearTwo() {
        SoccerLive live = new SoccerLive1();

        Match match1 = new Match("Man Utd", "Man City",
                java.util.Arrays.asList("Rashford", "Bruno"),
                java.util.Arrays.asList("Haaland", "De Bruyne"), 2, 3);

        Match match2 = new Match("Barcelona", "Real Madrid",
                java.util.Arrays.asList("Yamal", "De Jong"),
                java.util.Arrays.asList("Vini", "Mbappe"), 1, 1);

        live.addGame(match1);
        live.addGame(match2);

        //the number of games.
        assertEquals(2, live.numberOfGames());

        // Clear the collection
        live.clear();

        // Verify the collection is empty
        assertEquals(0, live.numberOfGames());
    }

    @Test
    public void clearAndAddAfter() {
        SoccerLive live = new SoccerLive1();

        Match match1 = new Match("Man Utd", "Man City",
                java.util.Arrays.asList("Rashford", "Bruno"),
                java.util.Arrays.asList("Haaland", "De Bruyne"), 2, 3);

        Match match2 = new Match("Barcelona", "Real Madrid",
                java.util.Arrays.asList("Yamal", "De Jong"),
                java.util.Arrays.asList("Vini", "Mbappe"), 1, 1);

        live.addGame(match1);
        live.addGame(match2);

        // Clear the collection
        live.clear();

        assertEquals(0, live.numberOfGames());

        // Add a new match after clearing
        Match newMatch = new Match("Bayern Munich", "Dortmund",
                java.util.Arrays.asList("Lewandowski", "Muller"),
                java.util.Arrays.asList("Reus", "Haller"), 3, 2);
        live.addGame(newMatch);

        //  new match is added.
        assertEquals(1, live.numberOfGames());
    }

    @Test
    public void testTransferFrom() {
        SoccerLive source = new SoccerLive1();
        SoccerLive target = new SoccerLive1();

        Match match = new Match("Man Utd", "Man City",
                java.util.Arrays.asList("Rashford", "Bruno"),
                java.util.Arrays.asList("Haaland", "De Bruyne"), 2, 3);

        source.addGame(match);

        // Transfer games from source to target
        target.transferFrom(source);

        // Source should now be empty
        assertEquals(0, source.numberOfGames());

        // Target should have the match
        assertEquals(1, target.numberOfGames());
    }

    @Test
    public void testTransferFromEmptySource() {
        SoccerLive source = new SoccerLive1();
        SoccerLive target = new SoccerLive1();

        // Source is empty, so nothing should be transferred
        target.transferFrom(source);

        assertEquals(0, source.numberOfGames());

        // Target should still be empty
        assertEquals(0, target.numberOfGames());
    }

    @Test
    public void transferFromAfterClear() {
        SoccerLive source = new SoccerLive1();
        SoccerLive target = new SoccerLive1();

        Match match1 = new Match("Man Utd", "Man City",
                java.util.Arrays.asList("Rashford", "Bruno"),
                java.util.Arrays.asList("Haaland", "De Bruyne"), 2, 3);

        source.addGame(match1);

        target.clear();

        target.transferFrom(source);

        // Source should now be empty
        assertEquals(0, source.numberOfGames());

        // Target should have the transferred game
        assertEquals(1, target.numberOfGames());
    }

    @Test
    public void testNewInstance() {
        SoccerLive live = new SoccerLive1();
        SoccerLive newLive = live.newInstance();

        // A new instance should be empty
        assertEquals(0, newLive.numberOfGames());
    }

}