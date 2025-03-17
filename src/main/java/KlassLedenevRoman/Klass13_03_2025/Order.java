package KlassLedenevRoman.Klass13_03_2025;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class Order {

    private List<Coffee> coffeeList = new ArrayList<>();

    public void addCoffee(Coffee coffee) {
        coffeeList.add(coffee);
    }

    public int getTotalVolume() {
        int sum = 0;
        for (Coffee coffee : coffeeList) {
            sum += coffee.getVolume();
        }
        return sum;
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Coffee coffee : coffeeList) {
            sum += coffee.getPrice();
        }
        return sum;
    }


    public Map<String, List<Coffee>> groupByMilk() {
        Map<String, List<Coffee>> groupedCoffeeByMilk = new HashMap<>();
        String withMilk = "With milk";
        String withoutMilk = "Without milk";
        for (Coffee coffee : coffeeList) {
            if (coffee.isHasMilk()) {
                groupedCoffeeByMilk.putIfAbsent(withMilk, new ArrayList<>());
                groupedCoffeeByMilk.get(withMilk).add(coffee);
            } else {
                groupedCoffeeByMilk.putIfAbsent(withoutMilk, new ArrayList<>());
                groupedCoffeeByMilk.get(withoutMilk).add(coffee);
            }
        }
        return groupedCoffeeByMilk;
    }

    @Override
    public String toString() {
        return "Order{" +
                "coffeeList=" + coffeeList +
                '}';
    }
}

//создать класс Order (заказ)
//который содержит List<Coffee>
//с методами добавления кофе в заказ
//и вычисления суммарного объёма заказа
//и суммарной цены заказа