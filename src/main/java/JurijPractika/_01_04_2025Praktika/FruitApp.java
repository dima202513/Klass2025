package JurijPractika._01_04_2025Praktika;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FruitApp {
    public static void main(String[] args) {
        List<Fruit> fruits = List.of(
                new Fruit(2.5, "Apple", true),
                new Fruit(5, "Pineapple", false),
                new Fruit(3, "Orange", true),
                new Fruit(1, "Kiwi", true),
                new Fruit(1.3, "Banana", true),
                new Fruit(2, "Grape", true)
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Выберите фильтрацию:
                1 - наличие на складе
                2 - цена больше 2
                3 - название заканчивается на e
                4 - название длиннее 5 букв
                """);

        List<Predicate<Fruit>> predicates = new ArrayList<>();
        int answer = scanner.nextInt(); // сканируем ответ с клавиатуры и добавляем придикаты(условия фильтрации) в соотвествии с выбором
        while (answer != 0) { // выход из цикла - окончание ввода придикатов - 0
            switch (answer) {
                case 1 -> predicates.add(Fruit::isInStock);
                case 2 -> predicates.add(f -> f.getPrice() > 2);
                case 3 -> predicates.add(f -> f.getName().charAt(f.getName().length() - 1) == 'e');
                case 4 -> predicates.add(f -> f.getName().length() > 5);
            }
            answer = scanner.nextInt();
        }

        System.out.println(filter(fruits, getPredicate(predicates))); // вывод результатов фильтрации с выбраными предикатами(условиями)
    }

    // метод для фильтрации списка фруктов
    public static List<Fruit> filter(List<Fruit> fruits, Predicate<Fruit> fruitPredicate) {
        return fruits.stream().filter(fruitPredicate).toList();
    }

    // метод для создания предиката(условия) фильтрации
    public static Predicate<Fruit> getPredicate(List<Predicate<Fruit>> predicates) {
        if (predicates == null || predicates.isEmpty()) {
            throw new IllegalArgumentException("No predicates in the list.");
        }

        Predicate<Fruit> predicate = predicates.getFirst();
        for (int i = 1; i < predicates.size(); i++) {
            predicate = predicate.and(predicates.get(i));
        }
        return predicate;
    }

//    public static List<Fruit> getInStock(List<Fruit> fruits){
//        return fruits.stream().filter(Fruit::isInStock).toList();
//    }
//
//    public static List<Fruit> getPriceHigher(List<Fruit> fruits, double threshold){
//        return fruits.stream().filter(f -> f.getPrice() > threshold).toList();
//    }
//
//    public static List<Fruit> getNameEnds(List<Fruit> fruits, char letter){
//        return fruits.stream().filter(f -> f.getName().charAt(f.getName().length() - 1) == letter).toList();
//    }
}







//v prozesse
//public static List<Fruit> getInStock(List<Fruit> fruits){
//            return fruits.stream().filter(Fruit::isInStock).toList();
//        }
//
//        public static List<Fruit> getPriceHigher(List<Fruit> fruits, double threshold){
//            return fruits.stream().filter(f -> f.getPrice() > threshold).toList();
//        }
//
//        public static List<Fruit> getNameEnds(List<Fruit> fruits, char letter){
//            return fruits.stream().filter(f -> f.getName().charAt(f.getName().length() - 1) == letter).toList();
//        }
//        System.out.println("getInStock(fruits) = " + getInStock(fruits));
//        System.out.println("getPriceHigher(fruits,2) = " + getPriceHigher(fruits, 2));
//        System.out.println("getNameEnds(fruits,'e') = " + getNameEnds(fruits, 'e'));
//        switch (answer){
//            case 1 -> System.out.println(getInStock(fruits));
//            case 2 -> System.out.println(getPriceHigher(fruits, 2));
//            case 3 -> System.out.println(getNameEnds(fruits, 'e'));
//        }

//        Predicate<Fruit> predicate = switch (answer) {
//            case 1 -> Fruit::isInStock;
//            case 2 -> f -> f.getPrice() > 2;
//            case 3 -> f -> f.getName().charAt(f.getName().length() - 1) == 'e';
//            default -> _ -> true;
//        };
//        predicate = predicate.and(f -> f.getName().length() > 5);
//
//        System.out.println(filter(fruits,predicate));
//        Predicate<Fruit> predicate = switch (answer) {
//            case 1 -> Fruit::isInStock;
//            case 2 -> f -> f.getPrice() > 2;
//            case 3 -> f -> f.getName().charAt(f.getName().length() - 1) == 'e';
//            default -> f -> true;
//        };
//
//        System.out.println(filter(fruits,predicate));
//    }
//}
//List<Predicate<Fruit>> predicates = new ArrayList<>();
//int answer = scanner.nextInt();
//    while (answer!=0) {
//        switch (answer) {
//        case 1 -> predicates.add(Fruit::isInStock);
//            case 2 -> predicates.add(f -> f.getPrice() > 2);
//        case 3 -> predicates.add(f -> f.getName().charAt(f.getName().length() - 1) == 'e');
//        case 4 -> predicates.add(f -> f.getName().length() > 5);
//        }
//answer = scanner.nextInt();
//    }
//
//            System.out.println(filter(fruits,getPredicate(predicates)));
//        }
//
//import JurijPractika._01_04_2025Praktika.Fruit;

//public static List<Fruit> filter(List<Fruit> fruits, Predicate<Fruit> fruitPredicate){
//    return fruits.stream().filter(fruitPredicate).toList();
//}
//public static Predicate<Fruit> getPredicate(List<Predicate<Fruit>> predicates){
//    if (predicates == null || predicates.isEmpty()){
//        throw new IllegalArgumentException("No predicates in the list.");
//    }
//
//    Predicate<Fruit> predicate = predicates.getFirst();
//    for (int i = 1; i < predicates.size(); i++) {
//        predicate = predicate.and(predicates.get(i));
//    }
//    return predicate;
////}