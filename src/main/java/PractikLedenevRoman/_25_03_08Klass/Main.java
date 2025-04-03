package PractikLedenevRoman._25_03_08Klass;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public class Main {
    private static final Map <ItemType, UnaryOperator<Double>> map = new EnumMap<>(ItemType.class);
    static {
        map.put(ItemType.ELECTRONICS, price -> price * 0.9);
        map.put(ItemType.CLOTHING, price -> (price * 0.2 < 500) ? price * 0.8 : price - 500);
        map.put(ItemType.GROCERIES, price -> price - 50);
        map.put(ItemType.BOOKS, price -> (price > 1000) ? price * 0.95 : price);
    }
    public static void main(String[] args) {

        System.out.println(calculatePrice(ItemType.ELECTRONICS, 1000)); // 900.0
        System.out.println(calculatePrice(ItemType.CLOTHING, 3000));   // 2500.0
        System.out.println(calculatePrice(ItemType.GROCERIES, 200));   // 150.0
        System.out.println(calculatePrice(ItemType.BOOKS, 1200));      // 1140.0
    }

    public static double calculatePrice(ItemType type, double price){

        UnaryOperator<Double> discountFunction = map.get(type);
        return discountFunction.apply(price);
    }

    public static double calculatePriceEnumExample(ItemType type, double price) {
        UnaryOperator<Double> discountFunction = type.getDiscountFunction();
        return discountFunction.apply(price);
    }
}
//Есть enum ItemType, который содержит типы товаров:
//ELECTRONICS
//        CLOTHING
//GROCERIES
//        BOOKS
//Есть вот такая система скидок:
//ELECTRONICS — скидка 10% от цены.
//CLOTHING — скидка 20%, но не более 500 рублей.
//        GROCERIES — скидка фиксирована 50 рублей.
//        BOOKS — скидка 5%, но только если цена выше 1000 рублей.
//Напишите метод calculatePrice(ItemType type, double price), который принимает тип товара и цену, затем в зависимости от типа товара получает нужную функцию для скидки, и применяет её к цене.
//
//UnaryOperator<Double> discountFunction = получение нужной функции для скидки


//Пример результата в main
//System.out.println(calculatePrice(ItemType.ELECTRONICS, 1000)); // 900.0
//        System.out.println(calculatePrice(ItemType.CLOTHING, 3000));   // 2500.0
//        System.out.println(calculatePrice(ItemType.GROCERIES, 200));   // 150.0
//        System.out.println(calculatePrice(ItemType.BOOKS, 1200));      // 1140.0