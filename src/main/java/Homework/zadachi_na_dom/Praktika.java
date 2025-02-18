package Homework.zadachi_na_dom;

import java.util.ArrayList;
import java.util.List;

public class Praktika {
    public static void main(String[] args) {
List<String> strings = new ArrayList<>(List.of("AAA", "BBBB", "CCCCC"));
        System.out.println(countChars(strings));
    }

    public static List<Integer> countChars(List<String> strings) {

        List<Integer> countLength = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            countLength.add(strings.get(i).length());
        }
        return countLength;
    }
}

//у вас есть список значений String, вы должны вернуть список
//со всеми значениями String более трех символов


//У вас есть список значений String, вы должны вернуть список
// количества символов этих String