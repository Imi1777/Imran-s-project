public abstract class SoccerLiveSecondary implements SoccerLive {

    @Override
    public String showAllGames() {
        String gameResults = "";
        SoccerLive gameTemp = this.newInstance();
        while (this.numberOfGames() > 0) {
            Match currentMatch = this.removeAnyGame();
            gameResults += currentMatch.toString();
            gameTemp.addGame(currentMatch);
        }
        while (gameTemp.numberOfGames() > 0) {
            this.addGame(gameTemp.removeAnyGame());
        }
        return gameResults;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        // checks if they are not the same
        if (o == null) {
            return false;
        }

        if (!(o instanceof SoccerLive)) {
            return false;
        }

        // checks if the lists of the games in both objects equal
        SoccerLiveSecondary obj = (SoccerLiveSecondary) o;

        return this.showAllGames().equals(obj.showAllGames());

    }

    @Override
    public String toString() {
        String result = "";
        SoccerLive temp = this.newInstance();
        while (this.numberOfGames() > 0) {
            Match current = this.removeAnyGame();
            result += current;
            // TODO: put game in temporary SoccerLive
            temp.addGame(current);
        }
        while (temp.numberOfGames() > 0) {
            this.addGame(temp.removeAnyGame());
        }
        return result;
    }

}
