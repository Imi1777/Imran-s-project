package components.soccer;

import components.queue.Queue;
import components.queue.Queue1L;

public class SoccerLive1 extends SoccerLiveSecondary {

    // TODO: make constructor

    // TODO: pick representation

    private Queue<Match> games;

    public SoccerLive1() {
        this.games = new Queue1L<>();

    }

    @Override
    public void addGame(Match g) {
        // will add the game to the end of the queue
        this.games.enqueue(g);
    }

    @Override
    public Match removeAnyGame() {
        // removes and returns the front match from the queue
        return this.games.dequeue();
    }

    @Override
    public int numberOfGames() {
        // return how many games are in the queue.
        return this.games.length();
    }

    @Override
    public void clear() {
        //remove all games from the queue.
        this.games.clear();
    }

    @Override
    public SoccerLive newInstance() {
        // Make and return a new SoccerLive1 object
        return new SoccerLive1();
    }

    @Override
    public void transferFrom(SoccerLive source) {
        // will Transfer all the games from source to this
        while (source.numberOfGames() > 0) {
            // will dequeue a game from the source
            Match game = source.removeAnyGame();
            // add game to this queue
            this.addGame(game);
        }

    }

}
