package components.soccer;

import java.util.Iterator;

import components.queue.Queue;
import components.queue.Queue1L;

/**
 * SoccerLive1 represents a collection of soccer matches using a queue. It
 * provides methods to add, remove, and manage soccer games.
 */
public class SoccerLive1 extends SoccerLiveSecondary {

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
    public final Match removeAnyGame() {
        assert this.games.length() > 0;
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
        // Make and return a new SoccerLive1 object.
        return new SoccerLive1();
    }

    @Override
    public final void transferFrom(SoccerLive source) {
        // will Transfer all the games from source to this
        while (source.numberOfGames() > 0) {
            // will dequeue a game from the source
            Match game = source.removeAnyGame();
            // add game to this queue
            this.addGame(game);
        }

    }

    @Override
    public Iterator<Match> iterator() {
        return this.games.iterator();
    }

}
