package Homework.homezadacha2.fibonacciIspravil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence(7);

        System.out.println("Fibonacci sequence using for: " + Arrays.toString(fibonacciSequence.fibonacciSequenceFor()));
        System.out.println("Fibonacci sequence using while: " + Arrays.toString(fibonacciSequence.fibonacciSequenceWhile()));
        System.out.println("Fibonacci sequence using do-while: " + Arrays.toString(fibonacciSequence.fibonacciSequenceDoWhile()));
    }
}

//о условию у вас в классе должно быть только поле length и всё
//не нужно выносить private int[] sequence; в поле класса
//вы прямо в методах с циклами for, while и do-while должны создавать массив нужной длины, и заполнять его числами фибоначчи.
// Все ваши методы с циклами должны возвращать массив
//а уже в мэйне через Arrays.toString вы эти массивы печатаете