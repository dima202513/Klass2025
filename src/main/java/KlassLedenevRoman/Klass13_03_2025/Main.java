package KlassLedenevRoman.Klass13_03_2025;

public class Main {
    public static void main(String[] args) {
      Order order = new Order();
      order.addCoffee(Coffee.AMERICANO);
      order.addCoffee(Coffee.LATTE);
      order.addCoffee(Coffee.AMERICANO);
      order.addCoffee(Coffee.ESPRESSO);
        System.out.println("order = " + order);

        System.out.println("order.getTotalVolume() = " + order.getTotalVolume());
        System.out.println("order.getTotalPrice() = " + order.getTotalPrice());
        System.out.println("order.groupByMilk() = " + order.groupByMilk());
    }
}

