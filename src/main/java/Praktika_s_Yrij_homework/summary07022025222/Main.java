package Praktika_s_Yrij_homework.summary07022025222;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String str = "HGLJHDKZRDLIZ ktufkuzf uzfgluzv";

       printUnique(str);
    }

    public static void printUnique(String string) {
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            result.add(string.charAt(i));
        }
        System.out.println(result + " count dublicate: " + result.size());
    }
}

