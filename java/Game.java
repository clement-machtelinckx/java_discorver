public class Game {
    int id;
    String title;
    String genre;
    String releaseDate;
    double price;

    public Game(int id, String title, String genre, String releaseDate, double price) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game : \n" +
            "id=" + id + "\n" +
            "title='" + title + "'\n" +
            "genre='" + genre + "'\n" +
            "releaseDate='" + releaseDate + "'\n" +
            "price=" + price;
    }
}