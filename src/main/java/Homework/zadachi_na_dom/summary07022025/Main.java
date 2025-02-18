package Homework.zadachi_na_dom.summary07022025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static Homework.zadachi_na_dom.Praktika.countChars;
import static Homework.zadachi_na_dom.Praktika2.getStringLongerThanThree;
import static Homework.zadachi_na_dom.Praktika3.findAllMultiple;
import static Homework.zadachi_na_dom.Praktika3.findMaxLength;
import static PractikLedenevRoman.klassenarbeit2.Work.findMax;


public class Task_ArrayList {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("Hello", "Bye", "Goodbye", "Ay"));
        System.out.println(countChars(strings));
        System.out.println(getStringLongerThanThree(strings));
        System.out.println(findMaxLength(strings));

        List<Integer> integers = new ArrayList<>(List.of(3, 5, 6, 4, 2, 1));
        System.out.println(findSum(integers));
        System.out.println(findMax(integers));
        System.out.println(findAllMultiple(integers, 3));
        System.out.println(isSorted(integers));
        integers.sort(Comparator.naturalOrder());
        System.out.println(isSorted(integers));
    }

    private static boolean findSum(List<Integer> integers) {
        return false;
    }

}
