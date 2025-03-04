package PractikLedenevRoman._28_02_2025;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str1 = "5658765zu9 bp8978zp97   Hello World   85485   54876649765 76rr76r76";
        String str2 = "World";
        System.out.println(isContain(str2, str1));
        System.out.println(removeNumbers(str1));
        System.out.println(countWords(str1));
        System.out.println(getMaxLengthWord(str1));
    }

    public static boolean isContain(String str1, String str2) {
        String longer = null;
        String shorter = null;
        if (str1.length() >= str2.length()) {
            longer = str1;
            shorter = str2;

        } else {
            shorter = str1;
            longer = str2;
        }
//        Pattern pattern = Pattern.compile(shorter);
//        Matcher matcher = pattern.matcher(longer);
//        if (matcher.find()) {
//            return true;
//        } else {
//            return false;
//        }
        return longer.contains(shorter);
    }

    public static String removeNumbers(String str1) {
//    return str1.replaceAll("\\d", "");
        StringBuilder stringBuilder = new StringBuilder(str1);
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(stringBuilder);
        int pointer = 0;
        while ((matcher.find(pointer))) {
            stringBuilder.deleteCharAt(matcher.start());
            pointer = matcher.start();
        }
        return stringBuilder.toString();

    }


    public static int countWords(String str1) {
       return str1.split("\\s+").length;

    }

    public static String getMaxLengthWord(String str){
        int maxLength = 0;
        String maxWord = null;
        String[] words = str.split("\\s+");
        System.out.println(Arrays.toString(words));
        for (String word : words){
           if (word.length() >  maxLength){
               maxLength = word.length();
               maxWord = word;
           }


        }
        return maxWord;
    }
    /**
     * Дана строка - проверить правильно ли в ней расставлены скобки
     */
    public static boolean checkParenthesis(String text) {
        Pattern leftParenthesis = Pattern.compile("\\(");
        Matcher matcherLeftParenthesis = leftParenthesis.matcher(text);
        Pattern rightParenthesis = Pattern.compile("\\)");
        Matcher matcherRightParenthesis = rightParenthesis.matcher(text);
        boolean hasLeft = matcherLeftParenthesis.find(), hasRight = matcherRightParenthesis.find();
        while (hasLeft || hasRight) {
            if (!hasLeft || !hasRight) {
                return false;
            }
            if (matcherLeftParenthesis.start() > matcherRightParenthesis.start()) {
                return false;
            }
            hasLeft = matcherLeftParenthesis.find();
            hasRight = matcherRightParenthesis.find();
        }
//        try {
//            Pattern.compile(text);
//            return true;
//        } catch (PatternSyntaxException e) {
//            return false;
//        }
        return true;
    }
//    Дано натуральное число. Получить строку, в которой тройки цифр этого числа
//    разделены пробелом, начиная с правого конца. Например, число 1234567 преобразуется в 1 234 567.

}


//Строка состоит из слов, разделенных одним или несколькими
//пробелами. Найдите слово наибольшей длины.

//Даны две строки. Определите, содержится
// ли меньшая по длине строка в большей.
//Удалить в строке все цифры.
//Дана строка, состоящая из слов, разделенных пробелами.
//Определите количество слов в строке.
