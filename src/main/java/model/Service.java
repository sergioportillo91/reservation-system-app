package model;

public class Service {

    private final Long id;
    private final String name;
    private final double price;

    public Service(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
