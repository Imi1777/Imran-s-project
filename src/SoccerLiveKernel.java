import components.standard.Standard;

public interface SoccerLiveKernel extends Standard<SoccerLive> {

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
