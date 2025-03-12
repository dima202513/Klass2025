package Homework.homeworkStroka.Ispravlenie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StrokaGruppaTest {

    @Test
    void testOnlyPunctuation() {
        String text = "!!! ??? ...";
        String expected = "";
        String actual = StrokaGruppa.formatText(text);
        assertEquals(expected, actual, "Expected:\n" + expected + "\nActual:\n" + actual);
    }


    @Test
    void testTextWithNumbersAndSymbols() {
        String input = "Once upon a time a Wolf was lapping at a spring on a hillside, when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";
        String expected = "a:\n  a - 6\n  at - 1\n" +
                "b:\n  beginning - 1\n  but - 1\n" +
                "d:\n  down - 1\n  drink - 1\n" +
                "h:\n  he - 1\n  hillside - 1\n" +
                "j:\n  just - 1\n" +
                "l:\n  lamb - 1\n  lapping - 1\n  little - 1\n  looking - 1\n  lower - 1\n" +
                "o:\n  on - 1\n  once - 1\n" +
                "s:\n  see - 1\n  should - 1\n  spring - 1\n" +
                "t:\n  time - 1\n  to - 1\n" +
                "u:\n  up - 1\n  upon - 1\n" +
                "w:\n  was - 1\n  what - 1\n  when - 1\n  wolf - 1\n";
        String actual = StrokaGruppa.formatText(input).trim();
        System.out.println("Expected:\n" + expected);
        System.out.println("Actual:\n" + actual);
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expected = "";
        String actual = StrokaGruppa.formatText(input);
        assertEquals(expected, actual);
    }

    @Test
    void testNullInput() {
        try {
            StrokaGruppa.formatText(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    void testDifferentLanguage() {
        String text = "Привет мир! Hello world!";
        String expected = "h:\n  hello - 1\nw:\n  world - 1\n";

        String actual = StrokaGruppa.formatText(text);
        assertEquals(expected, actual, "Expected:\n" + expected + "\nActual:\n" + actual);
    }

}


