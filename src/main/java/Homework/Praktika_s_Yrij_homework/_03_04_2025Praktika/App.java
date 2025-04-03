package Homework.Praktika_s_Yrij_homework._03_04_2025Praktika;


import java.util.List;
import java.util.Optional;

public class App {

    public static void main(String[] args) {

        Student student1 = new Student("Natasha", 21);
        Student student2 = new Student("PetrOleg", 19);
        Student student3 = new Student( "oleg1", 22);
        Student student4 = new Student("Sasha", 18);

        student1.add(new Book("1001 night", 45));
        student1.add(new Book("1001 words", 5));
        student1.add(new Book("1001 words", 45));
        student1.add(new Book("1001 rules", 45));

        Optional<Book> book = student1.getBook("1001 night");
         Book book1 = book.orElseThrow(() -> new IllegalArgumentException("Book not found"));


        List<Student> students = List.of(student1, student2, student3, student4);
    }

    public static List<String> giveBooks(List<Student> students) {
        return students.stream().flatMap(student -> student.getBooks().stream())
                .map(book -> book.getName())
                .distinct().toList();
    }



}

