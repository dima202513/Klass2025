package Homework.homeworkStroka.Ispravlenie;
import java.util.*;

public class StrokaGruppa {

    public static String formatText(String text) {
        text = text.toLowerCase().replaceAll("[^a-z]", " ");
//        text = text.toLowerCase().replaceAll("[^a-z ]", "");
//      Map<Character, Map<String, Integer>> groupedWords = new LinkedHashMap<>();
        Map<Character, Map<String, Integer>> groupedWords = new TreeMap<>();
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = word.charAt(0);
//                groupedWords.putIfAbsent(firstLetter, new LinkedHashMap<>());
                groupedWords.putIfAbsent(firstLetter, new TreeMap<>());
                Map<String, Integer> wordCount = groupedWords.get(firstLetter);
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Map<String, Integer>> entry : groupedWords.entrySet()) {
            result.append(entry.getKey()).append(":\n");
            for (Map.Entry<String, Integer> wordEntry : entry.getValue().entrySet()) {
                result.append("  ").append(wordEntry.getKey()).append(" - ").append(wordEntry.getValue()).append("\n");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String text = "Once upon a time a Wolf was lapping at a spring on a hillside, when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";
        String formattedText = formatText(text);
        System.out.println(formattedText);
    }
}