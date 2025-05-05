package at.technikum.oop.library;

import at.technikum.oop.library.items.Item;
import at.technikum.oop.library.items.Rentable;

import java.time.LocalDateTime;

public class Library {

    public void rent(Rentable rentable) {
        if (rentable.isAvailable()) {
            rentable.setRentedAt(LocalDateTime.now());
        }
    }
}
