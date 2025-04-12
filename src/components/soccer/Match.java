package components.soccer;

import java.util.List;

/**
 * this represents a soccer match between two teams. this also includes the
 * teams, their players, and the match's score.
 */
public record Match(String team1, String team2, List<String> team1Players,
        List<String> team2Players, int team1Score, int team2Score) {
}