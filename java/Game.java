import java.util.Objects;

public abstract class Game {
    int id;
    String title;
    String genre;
    String releaseDate;
    double price;
    Platform platform;

    public Game(int id, String title, String genre, String releaseDate, double price, Platform platform) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.price = price;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Game : \n" +
            "id=" + id + "\n" +
            "title='" + title + "'\n" +
            "genre='" + genre + "'\n" +
            "releaseDate='" + releaseDate + "'\n" +
            "price=" + price + "\n" +
            "platform=" + platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false; // on compare tous les sous-types entre eux
        Game other = (Game) o;
        String t1 = (title == null) ? null : title.trim().toLowerCase();
        String t2 = (other.title == null) ? null : other.title.trim().toLowerCase();
        return Objects.equals(t1, t2) && platform == other.platform;
    }

    @Override
    public int hashCode() {
        String norm = (title == null) ? null : title.trim().toLowerCase();
        return Objects.hash(norm, platform);
    }
    
    public abstract String kind();
}
