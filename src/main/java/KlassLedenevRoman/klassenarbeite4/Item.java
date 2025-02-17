package KlassLedenevRoman.klassenarbeite4;

public class Item {
    private String name;
    private double price;
    private double rating;

    public Item(String name, double rating, double price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return (int) rating;
    }
}
