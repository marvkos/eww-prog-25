package at.technikum.oop.library.items;

public class NewBook extends Book implements Rentable, Donatable {

    private String isbn;

    public NewBook(String title,
                   String author,
                   int year,
                   boolean available,
                   String isbn) {
        super(title, author, year, available);
        this.isbn = isbn;
    }

    @Override
    public boolean isNeeded() {
        // only if we dont have 5 items
        return false;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
