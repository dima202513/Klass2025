package hauseaufgabebankkarta;

public class Valuta {
    private String nameGeld;
    private double price;
    private double rating;

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public String getNameGeld() {
        return nameGeld;
    }



    public Valuta(String name, double price, double rating) {
        this.nameGeld = name;
        this.price = price;
        this.rating = rating;
    }


}
