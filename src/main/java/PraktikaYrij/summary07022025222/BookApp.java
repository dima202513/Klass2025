package PraktikaYrij.summary07022025222;

import java.util.HashSet;
import java.util.Set;

public class BookApp {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");

        System.out.println("String set size " + stringSet.size());

        stringSet.add("two");
        System.out.println("String set size " + stringSet.size());
Set<Book> bookSet = new HashSet<>();
bookSet.add(new Book("one"));
bookSet.add(new Book("one"));
        System.out.println("Book set size " + bookSet.size());
    }

}
