package JurijPractika._29_04_2025;

import java.util.HashMap;
import java.util.Map;

public class BookStorage {
    private Map<String, Book> bookMap = new HashMap<>();

    public BookStorage() {
        var one = new Book("One", "1234");
        var two = new Book("Two", "2345");
        bookMap.put(one.getIsbn(), one);
        bookMap.put(two.getIsbn(), two);
    }
    public Book getBook(String isbn){
        if (isbn.length() != 4){
            throw  new IncorrectIsbnException("Incorrect isbn: " + isbn);
        }
        var book = bookMap.get(isbn);
        if (book == null){
            throw new BookNotFoundException("This book not fond: " + isbn + " not found");
        }
        return book;
    }


}
