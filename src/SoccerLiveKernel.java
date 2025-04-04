import components.standard.Standard;

public interface SoccerLiveKernel extends Standard<SoccerLive> {

    /**
     *
     * @param g
     * @ensures
     */
    void addGame(Match g);

}
