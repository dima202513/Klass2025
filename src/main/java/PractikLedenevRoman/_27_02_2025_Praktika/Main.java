package PractikLedenevRoman._27_02_2025_Praktika;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s1 = "   Он решил apples xabc2 оплатить    word картой bere Mastercard    word с номером x abc3 1234-5678-9012-3456.  ";
        System.out.println(getCountNumbers((s1)));
        System.out.println(replaceWord(s1));
        System.out.println(deleteLetter(s1));
        System.out.println(deleteABC(s1));
        System.out.println(deleteSpaces(s1));
        System.out.println(summaCifer(s1));
        System.out.println(findCharsInWords("words", "letters"));
    }

    public static int getCountNumbers(String text) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static String replaceWord(String text) {
//        return text.replaceAll("word", "letter");
        StringBuilder s = new StringBuilder(text);
        Pattern pattern = Pattern.compile("word");
        Matcher matcher = pattern.matcher((s));
        int pointer = 0;

        while (matcher.find(pointer)) {
            int start = matcher.start();
            int end = matcher.end();
            pointer = end + 1;
            s.replace(start, end, "letter");

        }
        return s.toString();
    }

    public static String deleteLetter(String text) {
        int pointer = 0;
        StringBuilder testCopy = new StringBuilder(text);
        Pattern pattern = Pattern.compile("x[abc|acb|bac|cab|bca|cba]");
        Matcher matcher = pattern.matcher(testCopy);
        while (matcher.find(pointer)) {
            testCopy.deleteCharAt(matcher.start());
            pointer = matcher.end();
        }
        return text.replaceAll("x(?=abc|acb|bac|bca|cab|cba)", "");
    }

    public static String deleteABC(String text) {
        return text.replaceAll("(abc|acb|bac|bca|cab|cba)(?=\\d)", "");

    }

    public static String deleteSpaces(String text) {
        return text.trim().replaceAll("\\s{2,}", " ");
    }

    public static int summaCifer(String text) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        return sum;
    }

    public static List<Character> findCharsInWords(String s1, String s2) {
        Map<Character, Integer> letterCountMap1 = getLetterCountMap(s1);
        Map<Character, Integer> letterCountMap2 = getLetterCountMap(s2);
        Set<Map.Entry<Character, Integer>> letterCountSet = letterCountMap1.entrySet();
        letterCountSet.retainAll(letterCountMap2.entrySet());
        ArrayList<Character> output = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : letterCountSet) {
            if (entry.getValue().equals(1)) {
                output.add(entry.getKey());
            }
        }
        return output;
    }

    private static Map<Character, Integer> getLetterCountMap(String s) {
        Map<Character, Integer> letterCountMap = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (!letterCountMap.containsKey(c)) {
                letterCountMap.put(c, 1);
            } else {
                letterCountMap.put(c, letterCountMap.get(c) + 1);
            }
        }
        return letterCountMap;
    }
}
//1.     В данной строке найти количество цифр.
//Замените в строке все вхождения 'word' на 'letter'
//Удалите в строке все буквы 'x'. за которыми следует 'abc'.
//        2.     Удалите в строке все 'abc', за которыми следует цифра.
//return text.replaceAll("x(?=abc|acb|bac|bca|cab|cba)", "");
//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные
//пробелы. Крайние пробелы в строке удалить.
//Дан текст. Найти сумму имеющихся в нем цифр
//1.Даны два слова. Найдите только те символы слов, которые встречаются в обоих словах только один раз.