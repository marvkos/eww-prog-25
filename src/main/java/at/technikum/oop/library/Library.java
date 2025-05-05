package at.technikum.oop.library;

import at.technikum.oop.library.items.Item;

import java.time.LocalDateTime;

public class Library {

    public void rent(Item item) {
        item.print();
        if(item.isAvailable()) {
            item.setAvailable(false);
            item.setRentedAt(LocalDateTime.now());
        } else {
            System.out.println("Item not available");
        }
    }
}
