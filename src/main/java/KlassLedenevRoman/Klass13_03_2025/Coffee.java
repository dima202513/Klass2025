package KlassLedenevRoman.Klass13_03_2025;

public enum Coffee {
    ESPRESSO(2.50, 30, false),
    AMERICANO(3.00, 150, true),
    LATTE(4.50, 250, false),
    CAPPUCCINO(4.00, 200,false),
    MOCHA(5.00, 300, false),
    MACCHIATO(3.50, 50,true ),
    FLAT_WHITE(4.80, 200, true);


    private double price;
    private int volume;
private  boolean hasMilk;

    Coffee(double price, int volume, boolean hasMilk) {
        this.price = price;
        this.volume = volume;
        this.hasMilk = hasMilk;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public double getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return name() +
                "(price=" + price +
                ", volume=" + volume + ")";
    }
}


//создать перечисление Coffee
//у кофе должна быть цена и объём