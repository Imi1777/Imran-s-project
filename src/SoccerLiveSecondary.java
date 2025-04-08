public abstract class SoccerLiveSecondary implements SoccerLive {

    @Override
    public String showAllGames() {

    }

    @Override
    public boolean equals(Object o) {

    }

    @Override
    public String toString() {
        String result = "";
        while (this.numberOfGames() > 0) {
            Match current = this.removeAnyGame();
            result += current;
            // TODO: put game in temporary SoccerLive
        }
        return result;
    }

}
