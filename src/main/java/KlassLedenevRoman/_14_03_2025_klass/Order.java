package KlassLedenevRoman._14_03_2025_klass;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class Order {
    private static int counter = 1;
    private int id;
    private String customerName;
    private Map<Item, Integer> map;
    private OrderStatus status;

    public Order(User user) {
        map = new EnumMap<>(Item.class);
        status = OrderStatus.NEW;
        id = counter++;
        this.customerName = user.getName();
        Storage.addOrder(this);
    }

    public void add(Item item) {
        if (!map.containsKey(item)) {
            map.put(item, 1);
        } else {
            int oldCount = map.get(item);
            map.put(item, oldCount + 1);
        }
    }

    public void add(Item item, int count) {
        if (!map.containsKey(item)) {
            map.put(item, count);
        } else {
            int oldCount = map.get(item);
            map.put(item, oldCount + count);
        }
    }

    public void increase(Item item) {
        add(item);
    }

    public void decrease(Item item) {
        if (map.containsKey(item)) {
            int oldCount = map.get(item);
            if (oldCount - 1 == 0) {
                map.remove(item);
            } else {
                map.put(item, oldCount - 1);
            }
        }
    }

    public void remove(Item item) {
        map.remove(item);
    }

    public void changeStatus() {
        OrderStatus newStatus = status.next();
        if (status != newStatus) {
            System.out.println("Заказ № " + id + " статус: " + status + " -> " + newStatus);
            status = newStatus;
        }


    }

    public void cancel() {
        if (status == OrderStatus.PROCESSING || status == OrderStatus.NEW) {
            status = OrderStatus.CANCELED;
        }

    }

    public double getTotalAmount() {
        double sum = 0;
        Set<Map.Entry<Item, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Item, Integer> entry : entrySet) {
            sum += entry.getKey().getPrice() * entry.getValue();
        }
        return sum;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Map<Item, Integer> getMap() {
        return map;
    }

    public OrderStatus getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", items=" + map +
                ", status=" + status +
                '}';
    }

}
//дополнительно:
//        -
//        -          добавить класс User с именем и ролью (enum ADMIN, CUSTOMER), и передавать его в конструктор Order вместо customerName.
//        -          модифицировать программу таким образом, что бы из хранилища ADMIN получал все заказы, а CUSTOMER только свои.