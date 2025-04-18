package components.soccer;

/**
 * The SoccerLive interface extends SoccerLiveKernel. It adds a method to show
 * all the games in the list as a string.
 */
public interface SoccerLive extends SoccerLiveKernel {

    /**
     * Shows all the games in the list as a string.
     *
     * @return the String that define all the games
     * @ensures returns the string that contains all the games
     */
    String showAllGames();
}
