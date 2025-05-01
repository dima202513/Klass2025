package Summory_Rodin._04_04_2025practik;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main4 {

    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is cool",
                "Streams are powerful",
                "FlatMap is handy"
        );
        List<String> words = sentences.stream()
                .flatMap(sentence -> Stream.of(sentence.split(" ")))
                .toList();

        System.out.println(words);

        List<String> paragraphs = List.of(
                "Java streams are very useful",
                "FlatMap helps flatten structures",
                "Practice makes perfect"
        );
        Set<String> wordsUniqToLowCaser = paragraphs.stream()
                .flatMap(paragraph -> Stream.of(paragraph.split(" ")))
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        System.out.println(wordsUniqToLowCaser);
    }
    List<Order> orders = List.of(
        new Order(1, List.of(new Product("Pen", 1.5), new Product("Notebook", 3.0))),
        new Order(2, List.of(new Product("Pencil", 0.5), new Product("Pen", 1.5))),
        new Order(3, List.of(new Product("Notebook", 3.0), new Product("Eraser", 0.75)))
);
    Set <String> set1 = orders.stream()
            .map(o -> o.products)
            .flatMap(Collection::stream)
            .map(p -> p.getName())
            .collect(Collectors.toSet());
    Set <String> set2 = orders.stream()
            .flatMap(o -> o.products.stream().map(p-> p.name))
            .collect(Collectors.toSet());

}

//Задача 1:
//Дан список предложений:
//List<String> sentences = List.of(
//        "Java is cool",
//        "Streams are powerful",
//        "FlatMap is handy"
//);
////Разбить предложения на слова и собрать все слова в один список.
//
////Задача 2
//List<String> paragraphs = List.of(
//        "Java streams are very useful",
//        "FlatMap helps flatten structures",
//        "Practice makes perfect"
//);
////Извлечь все слова, преобразовав в нижний регистр и отфильтровав повторы, с помощью flatMap.
//
////Задача 3
////Есть два класса:
//class Order {
//    int id;
//    List<Product> products;
//}
//
//class Product {
//    String name;
//    double price;
//}
////И список заказов:
////List<Order> orders = List.of(
//        new Order(1, List.of(new Product("Pen", 1.5), new Product("Notebook", 3.0))),
//        new Order(2, List.of(new Product("Pencil", 0.5), new Product("Pen", 1.5))),
//        new Order(3, List.of(new Product("Notebook", 3.0), new Product("Eraser", 0.75)))
//);


//Получить уникальный список названий продуктов, заказанных
//хотя бы раз