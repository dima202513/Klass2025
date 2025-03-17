package KlassLedenevRoman._14_03_2025_klass;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static final List<Order> ORDERS = new ArrayList<>();

    public static void addOrder(Order order){
        ORDERS.add(order);
    }

    public static List<Order> getOrders(User user){
        if (user.getRole() == Role.ADMIN) {
            return ORDERS;
        }else{
            List<Order> customerOrders =  new ArrayList<>();
            for ( Order order : ORDERS){
                if (order.getCustomerName().equals(user.getName())){
                    customerOrders.add(order);
                }
            }
            return customerOrders;
        }
    }

}
