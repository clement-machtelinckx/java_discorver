import java.util.ArrayList;
import java.util.List;

public class GameCollection {
    private final List<Game> games = new ArrayList<>();

    public boolean add(Game game) {
        if (games.contains(game)) {
            System.out.println("Doublon refusé : même jeu + même plateforme -> "
                               + game.title + " (" + game.platform + ")");
            return false;
        }
        games.add(game);
        return true;
    }

    public void listGames() {
        for (Game g : games) System.out.println(g);
    }
}
