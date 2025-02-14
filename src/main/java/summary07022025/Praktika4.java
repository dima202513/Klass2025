package summary07022025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Praktika4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann"));
        names.add(null);
        names.add("");
        System.out.println(names);
        deleteNullAndEmpty(names);
        System.out.println(names);
    }


    public static void deleteNullAndEmpty(List<String> strings) {
        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()) {
         String s = stringIterator.next();
         if (s == null || s.isEmpty()) {
             stringIterator.remove();
         }

        }

    }


}
//Имеется заданный список имен студентов: List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""))
//С помощью итератора:
//a). Вывести имена, состоящие из 4 букв
//b). Удалить из списка null и пустые строки.
//С помощью listIterator:
//c). вывести все элементы листа в обратном порядке.
//        d). Удалить из списка все имена, начинающиеся на "T"
//e). Заменить в списке "Ann" на "student Ann"





