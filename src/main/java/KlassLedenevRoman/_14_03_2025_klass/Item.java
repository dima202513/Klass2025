package KlassLedenevRoman._14_03_2025_klass;

public enum Item {
    LAPTOP(1200.00),
    SMARTPHONE(800.00),
    HEADPHONES(150.00),
    TABLET(600.00),
    SMARTWATCH(250.00),
    MONITOR(300.00),
    KEYBOARD(100.00),
    MOUSE(50.00),
    PRINTER(200.00),
    SPEAKERS(180.00);

    private final double price;

    Item(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
