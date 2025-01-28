package homezadacha;

public class main {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence(6);
        System.out.println("Fibonacci sequence using for loop: " + fibonacciSequence.fibonacciSequenceFor());
        System.out.println("Fibonacci sequence using while loop: " + fibonacciSequence.fibonacciSequenceWhile());
        System.out.println("Fibonacci sequence using do-while loop: " + fibonacciSequence.fibonacciSequenceDoWhile());
    }
}



//Написать класс FibonacciSequence, в котором есть поле length - длинна последовательности Фибоначчи.
//        Написать 3 метода в этом классе, возвращающих последовательность фибоначчи размера length в виде массива. Пример [0, 1, 1, 2, 3, 5] для length = 6.
//Каждый метод использует свой вариант цикла: 1 метод через цикл for, 2 через while, 3 через do-while.
//Написать конструктор с параметром и без параметров для этого класса. Не допускать возможность установки отрицательного значения length.

//        Написать программу (отдельный класс с методом main) в котором создать объект класса FibonacciSequence и протестировать работу всех получившихся методов.