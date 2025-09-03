public class DigitalGame extends Game {
    double downloadSizeGb; // ex: 35.4

    public DigitalGame(int id, String title, String genre, String releaseDate, double price, double downloadSizeGb) {
        super(id, title, genre, releaseDate, price);
        this.downloadSizeGb = downloadSizeGb;
    }

    @Override
    public String toString() {
        return super.toString() + "\ndownloadSizeGb=" + downloadSizeGb;
    }
}
