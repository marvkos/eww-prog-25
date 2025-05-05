package at.technikum.oop.library.items;

public abstract class Book extends Item {

    private String title;
    private String author;
    private int year;

    public Book(
            String title,
            String author,
            int year,
            boolean available
    ) {
        super(available);
        System.out.println("Book Constructor");
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Book %s %s%n", this.title, this.id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
