package Homework.zadachi_na_dom;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Praktika6 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Tom", "Tim", "Mary", "Jane", "Mark", "Ann"));
        removeNamesStartTfromList(names);
        System.out.println(names);
    }

    public static void removeNamesStartTfromList(List<String> stringList) {
        ListIterator<String> listIterator = stringList.listIterator(stringList.size());
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            if (str != null && str.startsWith("T")) {
                listIterator.remove();
            }
        }
    }
}
