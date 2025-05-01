package JurijPractika._29_04_2025;

public class BookApp {

    public static void main(String[] args) {
        String one = "2345";
        String two = "5678";
        String three = "hello";

        BookStorage bookStorage = new BookStorage();

//        System.out.println(bookStorage.getBook(one));
//        System.out.println(bookStorage.getBook(two));
//        System.out.println(bookStorage.getBook(three));
        printBook(one, bookStorage);
        printBook(two, bookStorage);
        printBook(three, bookStorage);

    }
    public static void printBook(String isbn, BookStorage bookStorage){

        try {
            System.out.println(bookStorage.getBook(isbn));
        }catch (IncorrectIsbnException | BookNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
