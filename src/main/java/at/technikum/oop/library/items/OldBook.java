package at.technikum.oop.library.items;

public class OldBook extends Book implements Donatable {

    private int value;

    public OldBook(String title,
                   String author,
                   int year,
                   boolean available,
                   int value) {
        super(title, author, year, available);
        this.value = value;
    }

    @Override
    public boolean isNeeded() {
        return true;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
