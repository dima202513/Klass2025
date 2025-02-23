package Homework.Praktika_s_Yrij_homework.homework;

// Исключение при попытке доступа к невалидному индексу
public class InvalidIndexException extends RuntimeException {
    public InvalidIndexException(String message) {
        super(message);
    }
}
