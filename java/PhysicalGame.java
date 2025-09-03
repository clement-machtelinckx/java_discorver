public class PhysicalGame extends Game {
    String condition; // ex: "Neuf", "Très bon", "Bon", etc.

    public PhysicalGame(int id, String title, String genre, String releaseDate, double price, String condition) {
        super(id, title, genre, releaseDate, price);
        this.condition = condition;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncondition='" + condition + "'";
    }
}
