package at.technikum.oop.library.items;

public class EReader extends Item implements Rentable {

    private String name;
    private String manufacturer;

    public EReader(boolean available, String name, String manufacturer) {
        super(available);
        this.name = name;
        this.manufacturer = manufacturer;
    }

    @Override
    public void print() {
        System.out.printf("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
