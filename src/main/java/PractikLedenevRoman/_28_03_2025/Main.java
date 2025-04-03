//package PractikLedenevRoman._28_03_2025;
//
//import org.apache.commons.lang3.RandomStringUtils;
//
//public class Main {
//
//    public static void main(String[] args) {
//        List<String> words = List.of("apple", "banan", "orange", "banan");
//        List<String> names = List.of("Tom", "Nikolaj", "Sasha", "Tom", "Artem", "Urgi", "Oleg", "Varvara");
//
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 5);
//        List<Integer> list2 = Arrays.asList(4, 5, 6, 1);
//
//        Map<String, Integer> stringIntegerMap = Map.of(
//                "Apple", 3,
//                "Banana", 5,
//                "Orange", 1,
//                "Grapes", 3,
//                "Pineapple", 3);
//        System.out.println("findAllKeys(stringIntegerMap,3) = " + findAllKeys(stringIntegerMap, 3));
//
//        System.out.println(countUniqueWords(words));
//        System.out.println(countNames(names, "jhgfghf"));
//        System.out.println(getFirstName(names));
//        System.out.println(getForEndName(names));
//        System.out.println(countDivideBy7());
//        System.out.println(sumOfSquare());
//        System.out.println(isAllEven(List.of(6, 2, 8, 4, 8)));
//        System.out.println(isAllEven(findDivisiblePairs());
//        System.out.println(isAllEven(allCombinations());
//    }
//
//    private static long countUniqueWords(List<String> words) {
//        return words.stream().distinct().count();
//    }
//    private static long countNames(List<String> names, String name) {
//        return names.stream().filter(n -> n.equals(name)).count();
//    }
//
//    private static String getFirstName(List<String> names){
//        return names.stream().min(String::compareTo).get();
//    }
//    private static String getForEndName(List<String> names){
//        return names.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findAny().get();
//    }
//    private static long countDivideBy7(){
//        return IntStream.rangeClosed(1, 1000).filter(n -> n%7 == 0).count();
//    }
//    private static int sumOfSquare(){
//        return IntStream.rangeClosed(1, 100).map(n -> n * n).sum();
//    }
//    private static boolean isAllEven(List<Integer> numbers){
//        return numbers.stream().allMatch(n -> n% 2 == 0);
//    }
//    public class Task {
//        public static void main(String[] args) {
//            List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 5);
//            List<Integer> list2 = Arrays.asList(4, 5, 6, 1);
//
//            System.out.println("allMultiplications(list1,list2) = " + allMultiplications(list1, list2));
//        }
//
//        public static List<Integer> allMultiplications(List<Integer> list1, List<Integer> list2) {
//            return list1.stream().flatMap(x -> list2.stream().map(y -> x * y)).toList();
//        }
//
//    }
//
//    public static Set<List<Integer>> allCombinations(List<Integer> list1, List<Integer> list2) {
//        return list1.stream()
//                .flatMap(x -> list2.stream()
//                        .filter(y -> Objects.equals(y, x))
//                        .map(y -> Arrays.asList(x,y)))
//                .collect(Collectors.toSet());
//    }
//
//    public static Set<List<Integer>> findDivisiblePairs(List<Integer> list1, List<Integer> list2) {
//        return list1.stream()
//                .filter(x -> x != 1)
//                .flatMap(x -> list2.stream()
//                        .filter(y -> y != 1)
//                        .filter(y -> !x.equals(y))
//                        .filter(y -> x % y == 0 || y % x == 0)
//                        .map(y -> List.of(x, y)))
//                .collect(Collectors.toSet());
//    }
//
//        public static List<String> findAllKeys(Map <String,Integer> stringIntegerMap, int value){
//            return stringIntegerMap.entrySet().stream()
//                    .filter(entry -> entry.getValue().equals(value))
//                    .map(Map.Entry::getKey)
//                    .toList();
//        }
//    }
//List<String> strings = Stream.generate(() -> RandomStringUtils.randomAlphabetic(random.nextInt(15))).limit(20).toList();
//System.out.println("strings = " + strings);
//
//List<Integer> numbers = IntStream.generate(() -> random.nextInt(-100, 100)).limit(20).boxed().toList();
//System.out.println("numbers = " + numbers);
//
//public static String getFirstName(List<String> names) {
//    return names.stream().min(Comparator.naturalOrder()).orElseThrow(() -> new IllegalArgumentException("Invalid data."));
//}
//public static String getSecondLastName(List<String> names) {
//    return names.stream()
//            .distinct()
//            .sorted(Comparator.reverseOrder())
//            .skip(1)
//            .limit(2)
//            .findAny()
//            .orElseThrow(() -> new IllegalArgumentException("Invalid data."));
//}
//    public static double avrLength (List<String> strings, char c){
//        return strings.stream()
//                .filter(s -> s.charAt(0) == c)
//                .map(String::length)
//                .mapToDouble(i -> i)
//                .average()
//                .orElse(0.0);
//    }
//}
////Дан список строк. Необходимо отфильтровать строки, длина которых больше 3 символов, преобразовать их в верхний регистр, удалить повторяющиеся и вывести результат в отсортированном порядке.
//
//
////StringUtils
////
////            // a) Получить все возможные значения произведения чисел из обоих списков
////            Set<Integer> products = list1.stream()
////                    .flatMap(a -> list2.stream().map(b -> a * b))
////                    .collect(Collectors.toSet());
////            System.out.println("Все возможные произведения: " + products);
////
////            // b) Получить все возможные повторяющиеся пары чисел
////            List<List<Integer>> duplicatePairs = list1.stream()
////                    .flatMap(a -> list2.stream().filter(b -> a.equals(b)).map(b -> Arrays.asList(a, b)))
////                    .distinct()
////                    .collect(Collectors.toList());
////            System.out.println("Повторяющиеся пары: " + duplicatePairs);
////
////            // c) Найти все пары чисел, которые делятся друг на друга
////            List<List<Integer>> divisiblePairs = list1.stream()
////                    .flatMap(a -> list2.stream()
////                            .filter(b -> a % b == 0 || b % a == 0)
////                            .map(b -> Arrays.asList(a, b)))
////                    .collect(Collectors.toList());
////            System.out.println("Пары чисел, которые делятся друг на друга: " + divisiblePairs);
////        }
////    }
//
//}
//Дан список слов. Необходимо найти среднюю длину слов, начинающихся с буквы "A".
//Дан список чисел. Необходимо найти сумму всех четных чисел.
//Дан список чисел. Необходимо найти среднее значение всех чисел. //average()
//Дан список слов. Необходимо найти самое длинное слово.
//Дан список чисел. Необходимо пропустить первые два элемента и вывести остальные
//Дан список слов. Необходимо проверить, содержит ли он хотя бы одно слово, начинающееся с буквы "A".
//Дан список строк. Необходимо объединить их в одну строку, разделенную запятой. //Collectors.joining()
//Дан список объектов Person. Необходимо сгруппировать их по возрасту и вывести результат.
//Дан список чисел. Необходимо проверить, являются ли все числа положительными.
//Дан список чисел. Необходимо найти первое четное число.
//Дан список чисел. Необходимо умножить все числа на заданное значение.
//Дан список строк. Необходимо найти сумму длин всех строк.
//Дан список чисел. Необходимо преобразовать его в массив.



//С помощью стримов:
//Посчитать количество неповторяющихся слов в списке
//Посчитать количество людей с именем "Tom" в списке имен
//Из списка имен вывести первое по алфавиту, предпоследнее по алфавиту
//Посчитать количество чисел от 1 до 1000, которые делятся на 7.
//Посчитать сумму квадратов чисел от 1 до 100
//Проверить, все ли числа из списка четные
//Имеется два списка элементов.List list1 = Arrays.asList(1, 2, 3, 5, 5);
//List list2 = Arrays.asList(4, 5, 6, 1);
//С помощью flatmap:
//a). Получить все возможные значения произведения чисел из обоих списков
//b). Получить все возможные повторяющиеся пары чисел из обоих списков [1, 1] [5, 5]
//с). Найти все пары чисел, которые делятся друг на друга [2, 4] [3, 6] [5, 1]