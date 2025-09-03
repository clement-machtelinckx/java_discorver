public class DigitalGame extends Game {
    double downloadSizeGb;

    public DigitalGame(int id, String title, String genre, String releaseDate, double price,
                       Platform platform, double downloadSizeGb) {
        super(id, title, genre, releaseDate, price, platform);
        this.downloadSizeGb = downloadSizeGb;
    }

    @Override
    public String toString() {
        return super.toString() + "\ndownloadSizeGb=" + downloadSizeGb;
    }

    @Override
    public String kind() { return "Numérique"; }
}
