package Homework.Praktika_s_Yrij_homework._03_04_2025Praktika;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {

    private String name;

    private int age;

    private List<Book> books;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Optional<Book> getBook(String name){
        return books.stream().filter(book -> book.getName().equals(name))
                .findFirst();
    }

    public void add(Book book){
        if (books == null){
            books = new ArrayList<>();
        }
        books.add(book);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books +
                '}';
    }
}
