import java.util.ArrayList;

public class GameCollection {
    ArrayList<Game> games;

    public GameCollection() {
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void listGames() {
        for (Game game : games) {
            System.out.println(game);
        }
    }
}