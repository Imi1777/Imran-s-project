package components.soccer;

import components.standard.Standard;

/**
 * The SoccerLiveKernel interface extends Standard and Iterable to manage a list
 * of soccer matches. It provides methods to add, remove, and count games in a
 * soccer live tracking system.
 * 
 * @param SoccerLive
 *            Represents the soccer live data.
 * @param Match
 *            Represents individual soccer matches.
 */
public interface SoccerLiveKernel
        extends Standard<SoccerLive>, Iterable<Match> {

    /**
     * This will add the game to the list of the games.
     *
     * @param g
     *            the match will be added to the list
     * @ensures The match will be added in front of the list game
     */
    void addGame(Match g);

    /**
     * Will remove and also return any games from the list game.
     *
     * @return the match that is removed from the list.
     * @requires there are games to remove
     * @ensures The match is removed from the list of the games.
     *
     */
    Match removeAnyGame();

    /**
     * shows how many games there is.
     *
     * @return the numbers of the games that are listed
     * @ensures the total numbers of game that is returned
     *
     */
    int numberOfGames();
}
