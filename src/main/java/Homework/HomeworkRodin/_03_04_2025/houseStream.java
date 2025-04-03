package Homework.HomeworkRodin._03_04_2025;

import java.util.List;
import java.util.stream.Collectors;

public class houseStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n%2 == 0)
                .toList();
        System.out.println(evenNumbers);

        List<String> words = List.of("apple", "banana", "cherry", "date");
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperCaseWords);

          List<Integer> numbersToCount = List.of(3, 5, 7, 9, 11, 15, 18, 21);
        long count = numbersToCount.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println(count);

        List<String> stringsToJoin = List.of("Java", "Stream", "API", "Example");
        String joinString = stringsToJoin.stream()
                .collect(Collectors.joining(" ,"));
        System.out.println(joinString);

        List<Integer> numberFindMax = List.of(23, 45, 12, 67, 34, 89, 90, 56);
        int max = numberFindMax.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("number not found"));
        System.out.println(max);
    }
}

// 1 уровень сложности: презентация по теме занятия - https://docs.google.com/presentation/d/1gzJ5WmE3bFe7OjrZZbI1ZtwNU_-4QDTsWDtmxeO3TBE/edit?usp=sharing
//Дз (обязательные задания):
//Фильтрация списка чисел
//Дан список целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
//Используя Stream API, оставьте только четные числа и выведите их на экран.
//Преобразование списка строк
//Дан список строк: ["apple", "banana", "cherry", "date"].
//Преобразуйте все строки в верхний регистр и выведите результат.
//Подсчет количества элементов
//Дан список чисел: [3, 5, 7, 9, 11, 15, 18, 21].//
//Подсчитайте, сколько в списке чисел больше 10, используя Stream API.
//Объединение строк в одну
//Дан список строк: ["Java", "Stream", "API", "Example"].
//Объедините все строки в одну, используя запятую в качестве разделителя (Java, Stream, API, Example).
//Поиск максимального значения
//Дан список чисел: [23, 45, 12, 67, 34, 89, 90, 56].
//Найдите максимальное значение с помощью Stream API.


//Дз (дополнительные задания):
//Группировка по длине строк
//Дан список строк: ["one", "three", "five", "seven", "eight", "ten"].
//Сгруппируйте строки по их длине и выведите результат в виде Map>.
//Поиск второго по величине числа
//Дан список чисел: [10, 5, 8, 20, 15, 25, 30].
//Найдите второе по величине число, используя Stream API.
//Частотный анализ символов в строке
//
//Подсчитайте, сколько раз встречается каждый символ (игнорируя пробелы), и выведите результат в виде Map.
//Даны два списка:
//List list1 = Arrays.asList("a", "b", "c");
//List list2 = Arrays.asList("d", "e", "f");
//Объедините их в один список с помощью Stream API.
//Поиск самого длинного слова
//Дан список строк: ["elephant", "cat", "butterfly", "dog", "dolphin"].
//Найдите самое длинное слово, используя Stream API.
//      2 уровень сложности: