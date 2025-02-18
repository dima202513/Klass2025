package Homework.zadachi_na_dom;

import java.util.ArrayList;
import java.util.List;

public class Praktika2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("skjdhg", "2lj", "wkjakjh", "w"));
        List<String> result = getStringLongerThanThree(strings);
        System.out.println(result);
    }

    public static List<String> getStringLongerThanThree(List<String> strings) {
        List<String> stringsLongerThanThree = new ArrayList<>();
        for (String s : strings) {
            if (s.length() > 3) {
                stringsLongerThanThree.add(s);
            }
        }
        return stringsLongerThanThree;
    }
}
