package at.technikum.oop.library;

import at.technikum.oop.library.items.Book;
import at.technikum.oop.library.items.CD;
import at.technikum.oop.library.items.EReader;
import at.technikum.oop.library.items.Item;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(
                "Harry Potter",
                "J. K. R.",
                1998,
                true
        );
        System.out.println(book1.getId());

        book1.print();

        Library library = new Library();
        library.rent(book1);

        CD cd1 = new CD("Greatest Hits", "ABBA", 1999, true);
        library.rent(cd1);

        EReader eReader = new EReader(true, "Kindle 3", "Amazon");
        library.rent(eReader);
    }
}
