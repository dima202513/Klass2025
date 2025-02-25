package KlassLedenevRoman._25_02_2025;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Praktis {

    public static void main(String[] args) {
        String s0 = "AF8D";
        var matches = Pattern.matches("[A-Z]{2}\\d?[A-Z]{1}", s0);
        System.out.println(matches);


String s1 = "1234567";
String s2 = "123-4567";
String s3 = "123 5678";
String regex = "\\d\\d\\d[-\\s]?\\d\\d\\d\\d";
        System.out.println(Pattern.matches(regex, s1));
        System.out.println(Pattern.matches(regex, s2));
        System.out.println(Pattern.matches(regex, s3));

}
}


//
//
//