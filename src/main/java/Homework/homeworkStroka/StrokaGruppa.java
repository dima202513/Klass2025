package Homework.homeworkStroka;

import java.util.*;

public class StrokaGruppa {
    public static void main(String[] args) {
        String text = "Once upon a time a Wolf was lapping at a spring on a hillside, when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";
        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        Map<Character, Map<String, Integer>> groupedWords = new TreeMap<>();
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = word.charAt(0);
                groupedWords.putIfAbsent(firstLetter, new TreeMap<>());
                Map<String, Integer> wordCount = groupedWords.get(firstLetter);
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);


            }
            for (Map.Entry<Character, Map<String, Integer>> entry : groupedWords.entrySet()) {
                System.out.println(entry.getKey() + ":");
                for (Map.Entry<String, Integer> wordEntry : entry.getValue().entrySet()) {
                    System.out.println("  " + wordEntry.getKey() + " - " + wordEntry.getValue());
                }
//      return;  }
            }
        }
    }
}
