package Summory_Rodin._04_04_2025practik;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {

        String[] arr = {"one", "three", "five", "seven", "eight", "ten"};
        Map<Integer, List<String>> map = Arrays.stream(arr)
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);


        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 25, 30);

        Integer secondMax = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(secondMax);

        String text = "stream api in java";

        Map<Character, Long> frequencyMap = text.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  // Подсчет частоты

        System.out.println(frequencyMap);

        List list1 = Arrays.asList("a", "b", "c");
        List list2 = Arrays.asList("d", "e", "f");
        List<String> str1 = Stream
                .concat(Stream.of("a", "b", "c"),
                        Stream.of("d", "e", "f"))
                .toList();
        System.out.println(str1);

        List<String> str2 = List.of("cat", "butterfly", "dog", "dolphin", "elephant");
        String res3= str2.stream()
                .max(Comparator.comparingInt(String::length))
                .orElseThrow();
        System.out.println(res3);


    }
}
//Есть список строк:
//List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "banana");
//Используя Stream API, посчитай, сколько раз каждое слово встречается,
// и сохрани результат в Map<String, Long>.

//Группировка по длине строк
//Дан список строк: ["one", "three", "five", "seven", "eight", "ten"].
//Сгруппируйте строки по их длине и выведите результат в виде Map>.

//Поиск второго по величине числа
//Дан список чисел: [10, 5, 8, 20, 15, 25, 30].
//Найдите второе по величине число, используя Stream API.

//Частотный анализ символов в строке
//Дана строка "stream api in java".
//Подсчитайте, сколько раз встречается каждый символ (игнорируя пробелы), и выведите результат в виде Map.
//String text1 = "stream api in java";

//Даны два списка:
//List list1 = Arrays.asList("a", "b", "c");
//List list2 = Arrays.asList("d", "e", "f");
//Объедините их в один список с помощью Stream API.
//List<String> list1 = Arrays.asList("a", "b", "c");
//List<String> list2 = Arrays.asList("d", "e", "f");

//Поиск самого длинного слова
//Дан список строк: ["elephant", "cat", "butterfly", "dog", "dolphin"].
//Найдите самое длинное слово, используя Stream API.
//List<String> words4 = Arrays.asList("elephant", "cat", "butterfly", "dog", "dolphin");
//
//




