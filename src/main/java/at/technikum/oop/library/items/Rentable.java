package at.technikum.oop.library.items;

import java.time.LocalDateTime;

public interface Rentable {

    boolean isAvailable();
    void setRentedAt(LocalDateTime localDateTime);
}
