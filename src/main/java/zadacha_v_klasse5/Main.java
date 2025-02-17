package zadacha_v_klasse5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("inna", "inna@gmail.com", "Avstria", 25, true);
        Customer customer2 = new Customer("sasha", "sasha@gmail.com", "Avstria", 55, true);
        Customer customer3 = new Customer("olya", "olya@gmail.com", "Avstria", 85, true);
        List<Customer> list = List.of(customer1, customer2, customer3);
        System.out.println(getEmailCountryMap(list));
        System.out.println(getEmailNameMap(list));
        System.out.println(getConfirmedCountMap(list));
    }

    public static Map<String, String> getEmailCountryMap(List<Customer> customers) {
        Map<String, String> result = new HashMap<>();
        for (Customer customer : customers) {
            result.put(customer.getEmail(), customer.getCountry());
        }
        return result;
    }

    public static Map<String, String> getEmailNameMap(List<Customer> customers) {
        Map<String, String> result = new HashMap<>();
        for (Customer customer : customers) {
            result.put(customer.getEmail(), customer.getName());
        }
        return result;
    }

    public static Map<Boolean, Integer> getConfirmedCountMap(List<Customer> customers) {
        Map<Boolean, Integer> result = new HashMap<>();
        result.put(true, 0);
        result.put(false, 0);

        for (Customer customer : customers) {
            if (customer.isEmailConfirmed()){
                result.put(true, result.get(true) + 1);
            }
                else {
                result.put(false, result.get(false) + 1);
            }
        }
        return result;
    }
}
//Имеется класс Customer c полями: public class Customer { private String name; private String email;
// private String country; private int bonusAmount; private boolean isEmailConfirmed; }
//На основе списка экземпляров данного класса List customers
//a. Получить Map email / страна
//b. Получить Map email / покупатель
//c. Получить Map isEmailConfirmed / количество подтвержденных и неподтвержденных email
//d. Получить Map> страна / список покупателей из данной страны
//e. Получить Map страна / суммарный накопленный бонус покупателей из данной страны