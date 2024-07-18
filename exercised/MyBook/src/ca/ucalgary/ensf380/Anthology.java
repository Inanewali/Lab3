package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    private String isbn;
    private int pages;

    public Anthology() {
    }

    public Anthology(String isbn, int pages) {
        this.isbn = isbn;
        this.pages = pages;
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Anthology";
    }

    @Override
    public String genre() {
        return "Method genre called from Fiction";
    }
}
