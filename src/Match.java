import java.util.List;

public record Match(String team1, String team2, List<String> team1Players,
        List<String> team2Players, int team1Score, int team2Score) {
}