package Homework.Praktika_s_Yrij_homework.homework;

import java.util.HashSet;
import java.util.Set;

public class _Task_Set {
    public static void main(String[] args) {
        Set<Integer> integerSet = Set.of(5, -2, 7, 1, -3, 4, 8);
        System.out.println(integerSet);
        System.out.println(findSumPositives(integerSet));

        Set<String> stringSet1 = Set.of("Hello", "Hey", "Bye", "Goodbye", "Ay");
        Set<String> stringSet2 = Set.of("Hi", "Good morning", "Farewell", "Goodbye", "Bye", "See you");

        System.out.println(findAllCombinations(stringSet1, integerSet));
        System.out.println(combineSets(stringSet1, stringSet2));
        System.out.println(findCommonElementsSet(stringSet1, stringSet2));
        System.out.println(filterUniqueSet(stringSet1, stringSet2));
    }

    public static int findSumPositives(Set<Integer> integerSet) {
        return integerSet.stream().filter(num -> num > 0).mapToInt(Integer::intValue).sum();
    }

    public static Set<String> findAllCombinations(Set<String> stringSet, Set<Integer> integerSet) {
        Set<String> combinations = new HashSet<>();
        for (Integer num : integerSet) {
            for (String str : stringSet) {
                combinations.add(num + str);
            }
        }
        return combinations;
    }

    public static <T> Set<T> combineSets(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> findCommonElementsSet(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static <T> Set<T> filterUniqueSet(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}

