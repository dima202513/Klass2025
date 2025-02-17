package zadacha_v_klasse2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "просветитель";
        String str2 = "терпеливость";
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str1 = str2.toLowerCase();

       char[] chars1 = str1.toCharArray();
       char[] chars2 = str2.toCharArray();
//
//        Arrays.sort(chars1);
//        Arrays.sort(chars2);
//
//        return Arrays.equals(chars1, chars2);
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < chars1.length; i++) {
            if (map1.containsKey(chars1[i])){
                int count = map1.get(chars1[i]);
                map1.put(chars1[i], count+1);

            } else {
                map1.put(chars1[i], 1);
            }

        }
        for (int i = 0; i < chars1.length; i++) {
            if (map2.containsKey(chars2[i])){
                int count = map2.get(chars2[i]);
                map2.put(chars2[i], count+1);

            } else {
                map2.put(chars2[i], 1);
            }

        }
        System.out.println(map1);
        System.out.println(map2);
        return map1.equals(map2);
    }
}
//Дано 2 строки, проверить являются ли они анаграммами