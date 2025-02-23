package Homework.Praktika_s_Yrij_homework.homework;

// Исключение при попытке добавить элемент в заполненный список
public class ListFullException extends RuntimeException {
    public ListFullException(String message) {
        super(message);
    }
}
