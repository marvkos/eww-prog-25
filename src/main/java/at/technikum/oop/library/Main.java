package at.technikum.oop.library;

import at.technikum.oop.library.items.*;

public class Main {

    public static void main(String[] args) {

        NewBook book1 = new NewBook(
                "Harry Potter",
                "J. K. R.",
                1998,
                true,
                "1564684-6868-84"
        );
        System.out.println(book1.getIsbn());

        book1.print();

        Library library = new Library();
        library.rent(book1);

        CD cd1 = new CD("Greatest Hits", "ABBA", 1999, true);
        library.rent(cd1);

        EReader eReader = new EReader(true, "Kindle 3", "Amazon");
        library.rent(eReader);

        OldBook oldBook = new OldBook("Bibel", "Gutenberg", 1440, false, 100000);
        //library.rent(oldBook);
    }
}
