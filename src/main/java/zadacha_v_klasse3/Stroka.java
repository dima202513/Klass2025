package zadacha_v_klasse3;

import java.util.Map;

public class Stroka {
    public static void main(String[] args) {

        System.out.println();
    }

    public static String getStringNumber(Integer integer) {
//        String[] strings = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
//        Integer index = integer - 1;
//        return strings[index];

        Map<Integer, String> map1 = Map.of(1, "one", 2, "two", 3, "three", 4,
                "four", 5, "five", 6, "six", 7, "seven", 8, "eight", 9, "nine", 10, "ten");
      return map1.get(integer);
    }


}
//Дано число от 1 до 10, вывести на экран его строковое представление