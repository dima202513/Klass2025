package summary07022025;

import java.util.Set;
import java.util.HashSet;

public class Praktika8 {
    public static void main(String[] args) {
        Set<Integer> integers = Set.of(7, 5, 3, 6, 1, 9);
        Set<String> stringsSet = Set.of("aa", "bbb", "CCcc");

        // Example of calling getCombination
        Set<String> combinations = getCombination(stringsSet, integers);
        System.out.println(combinations);
    }

    public static int getSum(Set<Integer> integerSet) {
        int sum = 0;
        for (Integer anInt : integerSet) {
            if (anInt % 2 == 0) {
                sum += anInt;
            }
        }
        return sum;
    }

    // Получить все возможные комбинации из Set<String> и Set<Integer>
    // где каждая комбинация представляет собой строку и число, объединенные вместе.
    public static Set<String> getCombination(Set<String> strings, Set<Integer> integers) {
        Set<String> result = new HashSet<>();
        for (Integer anInt : integers) {
            for (String str : strings) {
                String combination = str + anInt;
                result.add(combination);
            }
        }
        return result;
    }
}