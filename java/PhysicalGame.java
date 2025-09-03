public class PhysicalGame extends Game {
    String condition;

    public PhysicalGame(int id, String title, String genre, String releaseDate, double price,
                        Platform platform, String condition) {
        super(id, title, genre, releaseDate, price, platform);
        this.condition = condition;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncondition='" + condition + "'";
    }

    @Override
    public String kind() { return "Physique"; }
}
