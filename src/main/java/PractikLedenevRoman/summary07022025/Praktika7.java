package PractikLedenevRoman.summary07022025;

import java.util.*;

public class Praktika7 {
    public static void main(String[] args) {
//        replaceStr(names);
        System.out.println();
    }
    private static void replace(List<String> stringList) {
        ListIterator<String> listIterator = stringList.listIterator(stringList.size());
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            if (str != null && str.equals("Ann")) {
                listIterator.set("student Ann");
            }
        }
    }
    public static List<String> getAllDublicates(List<String> strings){
        Set<String> stringsDublicates = new HashSet<>();
        for (int i = 0; i < strings.size(); i++) {
            for (int j = i + 1; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j))){
                    stringsDublicates.add(strings.get(i));
                }
            }
        }

        return new ArrayList<>(stringsDublicates);
    }
}
//public static List<String> getAllDublicates(List<String> strings){
//    List<String> stringsDublicates = new ArrayList<>();
//    for (int i = 0; i < strings.size(); i++) {
//        for (int j = i + 1; j < strings.size(); j++) {
//            if (strings.get(i).equals(strings.get(j))){
//                stringsDublicates.add(strings.get(i));
//            }
//        }
//    }
//    return stringsDublicates;
//}

/**
 * Найти все дубликаты в List<String> и вернуть их в виде нового списка
 */
