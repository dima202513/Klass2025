package zadacha_v_klasse5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("inna", "inna@gmail.com", "Avstria", 25, true);
        Customer customer2 = new Customer("sasha", "sasha@gmail.com", "Belgia", 55, true);
        Customer customer3 = new Customer("olya", "olya@gmail.com", "USA", 85, true);
        Customer customer4 = new Customer("oanna", "olya@gmail.com", "USA", 85, true);
        Customer customer5 = new Customer("inga", "olya@gmail.com", "Thailand", 85, true);
        List<Customer> customers = List.of(customer1, customer2, customer3, customer4, customer5);
        System.out.println(getEmailCountryMap(customers));
        System.out.println(getEmailNameMap(customers));
        System.out.println(getConfirmedCountMap(customers));
        System.out.println(getCountryCustomersMap(customers));
        System.out.println(getCountryCustomerNamesMap(customers));
        System.out.println(getCountrySumBonusMap(customers));
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

//vozvrat Получить Map> страна / список покупателей из данной страны
    public static Map<String, List<Customer>>  getCountryCustomersMap(List<Customer> customers){
        Map<String, List<Customer>> result = new HashMap<>();

        for (Customer customer : customers){
            if (result.containsKey(customer.getCountry())) {
                List<Customer> countryCustomerList = result.get(customer.getCountry());
                countryCustomerList.add(customer);
            } else {
                List<Customer> countryCustomerList = new ArrayList<>(List.of(customer));
                result.put(customer.getCountry(), countryCustomerList);
            }
        }
        return result;
    }

    public static Map<String, List<String>>  getCountryCustomerNamesMap(List<Customer> customers){
        Map<String, List<String>> result = new HashMap<>();

        for (Customer customer : customers){
            if (result.containsKey(customer.getCountry())) {
                List<String> countryCustomerList = result.get(customer.getCountry());
                countryCustomerList.add(customer.getName());
            } else {
                List<String> countryCustomerList = new ArrayList<>(List.of(customer.getName()));
                result.put(customer.getCountry(), countryCustomerList);
            }
        }
        return result;
    }

    public static Map<String, Integer> getCountrySumBonusMap(List<Customer> customers){
        Map<String, List<Customer>> countryCustomersMap = getCountryCustomersMap(customers);
        Map<String, Integer> result = new HashMap<>();
        Set<Map.Entry<String, List<Customer>>> set = countryCustomersMap.entrySet();
        for (Map.Entry<String, List<Customer>> entry : set){
            Integer sum = 0;
            for (Customer customer : entry.getValue()){
                sum += customer.getBonusAmount();
            }
            result.put(entry.getKey(), sum);
        }return result;
    }
}


//e. Получить Map страна / суммарный накопленный бонус покупателей из данной страны
//Имеется класс Customer c полями: public class Customer { private String name; private String email;
// private String country; private int bonusAmount; private boolean isEmailConfirmed; }
//На основе списка экземпляров данного класса List customers
//a. Получить Map email / страна
//b. Получить Map email / покупатель
//c. Получить Map isEmailConfirmed / количество подтвержденных и неподтвержденных email
//d. Получить Map> страна / список покупателей из данной страны
