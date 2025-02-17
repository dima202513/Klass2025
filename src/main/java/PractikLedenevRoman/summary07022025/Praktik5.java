package PractikLedenevRoman.summary07022025;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Praktik5 {


    public static List<String> reverseList(List<String> stringList) {
        ListIterator<String> listIterator = stringList.listIterator(stringList.size());
        List<String> result = new ArrayList<>();
        while (listIterator.hasPrevious()){
            result.add(listIterator.previous());
        }
        return result;
    }
}
