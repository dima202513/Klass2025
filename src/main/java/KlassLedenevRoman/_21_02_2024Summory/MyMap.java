package KlassLedenevRoman._21_02_2024Summory;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>(Map.of("inna", 45, "sasha", 34, "igor", 33));
        Map<Integer, Boolean> integerBooleanMap = Map.of(31, true, 4, true, 7, true);
        System.out.println(hasValueAboveTreshhold(stringIntegerMap, 37));
        System.out.println(isAllValueTrue(integerBooleanMap));
        System.out.println(getSum(stringIntegerMap, Set.of("inna", "igor")));
        System.out.println(getReverseMap(stringIntegerMap));
        System.out.println("groupedByLength(List.of(\"AAA\",\"BBB\",\"CCC\",\"AA\",\"BB\",\"CC\")) = " + groupedByLength(List.of("AAA", "BBB", "CCC", "AA", "BB", "CC")));
        Map<String, String> stringStringMap = Map.of("1", "1", "2", "2", "3", "H", "4", "4", "5", "A");
        System.out.println(findNumberKeys(stringStringMap));
        System.out.println(findNumberKeysRegex(stringStringMap));
    }

    public static boolean hasValueAboveTreshhold(Map<String, Integer> map, int treshhold) {
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > treshhold) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAllValueTrue(Map<Integer, Boolean> map) {
        Set<Map.Entry<Integer, Boolean>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Boolean> entry : entrySet) {
            if (!entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static Integer getSum(Map<String, Integer> map, Set<String> keys) {
        Integer sum = 0;
        for (String stringKey : keys) {
            if (map.containsKey(stringKey)) {
                sum += map.get(stringKey);
            }
        }
        return sum;
    }

    public static Map<Integer, String> getReverseMap(Map<String, Integer> map) {
        Map<Integer, String> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

    public static Map<Integer, List<String>> groupedByLength(List<String> strings) {
        Map<Integer, List<String>> integerListMap = new HashMap<>(); // создаем мапу
        for (String s : strings) { // берем слово из списка
            if (!integerListMap.containsKey(s.length())) { // если элемента с длиной этого слова нет
                ArrayList<String> words = new ArrayList<>();
                words.add(s);
                integerListMap.put(s.length(), words); // то добаляем новый элемент в мапу с ключем = длине, значением - новый с список с одним элементом - этим словом
            } else { // иначе добавляем слово в уже существующий список, находим список по ключу = длина слова
                List<String> words = integerListMap.get(s.length());
                words.add(s);
            }
        }
        return integerListMap;
    }
    public static Set<String> findNumberKeys(Map<String, String> stringStringMap) {
        Set<String> keys = new HashSet<>();
        for (Map.Entry<String, String> entry : stringStringMap.entrySet()) {
            try {
                Integer.parseInt(entry.getValue());
                keys.add(entry.getKey());
            } catch (NumberFormatException _) {
            }
        }
        return keys;
    }

    public static Set<String> findNumberKeysRegex(Map<String, String> stringStringMap) {
        Set<String> keys = new HashSet<>();
        for (Map.Entry<String, String> entry : stringStringMap.entrySet()) {
            if (entry.getValue().matches("\\d+")) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

}
//С помощью PriorityQueue реализовать модель: в магазин завозятся продукты с двух разных складов.
// У каждого продукта есть название и срок годности (пусть для простоты исчисляется в количестве оставшихся дней).
// В магазин приходят покупатели и выбирают продукт с наибольшим оставшемся сроком годности.


//Найти все ключи, значение которых состоит только из цифр.
//Дан список строк, нужно сгруппировать их по длине
//Дана мапа String Integer, вернуть мапу в которой все ключи являются значениями, а все значения ключами из этой мапы

//Найти сумму всех значений(int) в Map<String, Integer>, которые
// соответствуют заданному ключевому набору.


//2.Проверить, все ли значения в Map<Integer,
//Boolean> равны true.


//1.Проверить, содержит ли Map<String, Integer> хотя бы
//        одну запись, у которой значение больше заданного порога.