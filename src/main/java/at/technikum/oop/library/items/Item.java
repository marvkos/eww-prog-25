package at.technikum.oop.library.items;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Item {

    protected String id;
    protected boolean available;
    protected LocalDateTime rentedAt;

    public Item(boolean available) {
        System.out.println("Item Constructor");
        this.id = UUID.randomUUID().toString();
        this.available = available;
    }

    public abstract void print();

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDateTime getRentedAt() {
        return rentedAt;
    }

    public void setRentedAt(LocalDateTime rentedAt) {
        this.rentedAt = rentedAt;
    }
}
