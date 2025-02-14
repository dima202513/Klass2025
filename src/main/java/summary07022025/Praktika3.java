package summary07022025;

import java.util.ArrayList;
import java.util.List;

public class Praktika3 {
   public static int getSum(List<Integer> integerList) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        return sum;
    }
//
//у вас есть список String, вы должны вернуть максимальную длину
//    String

//    Написать метод, который выдает из исходного списка список всех
//        значений, делящихся на заданное число q.

//
//    /**
//     * у вас есть список String, вы должны вернуть максимальную длину String
//     */
    public static int findMaxLength(List<String> strings) {
        int maxLength = 0;
        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }
//
//    /**
//     * Написать метод, который выдает из исходного списка список всех значений, делящихся на заданное число q
//     */
    public static List<Integer> findAllMultiple(List<Integer> integers, int q) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for (Integer num : integers) {
            if (num % q == 0) {
                multiples.add(num);
            }
        }
        return multiples;
    }
}

//    Имеется заданный список имен студентов: List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""))
//    С помощью итератора:
//    a). Вывести имена, состоящие из 4 букв
//    b). Удалить из списка null и пустые строки.
//    С помощью listIterator:
//    c). вывести все элементы листа в обратном порядке.
//            d). Удалить из списка все имена, начинающиеся на "T"
//    e). Заменить в списке "Ann" на "student Ann"



//    List<String> names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann"));
//names.add(null);
//names.add("");
//}
