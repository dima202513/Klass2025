package Homework.homeworkStroka;

import java.util.*;

public class StrokaGruppa {

    public static void formatText(String text) {
        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        text = text.toUpperCase().replaceAll("[^A-Z ]", "");
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
            }
        }

    }


    public static void main(String[] args) {
        String text = "Once upon a time a Wolf was lapping at a spring on a hillside, when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";
        formatText(text);
    }

}

//Программа принимает на вход текст, произвольной длины, обрабатывает его и выводит все слова, которые
// встречаются в тексте (без дубликатов)
//* группируя их по первой букве в алфавитном порядке.
//        * Знаки препинания, кавычки, скобки (кроме апострофа) игнорируются, числа также игнорируются.
//* Регистр заглавных букв не учитывается. Подсчитать количество вхождений.