package Homework.homezadacha;

public class FibonacciSequence {
    private int length;
    private int[] sequence;
    public FibonacciSequence(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("dlina dolzna bit polozitelnim celim chislom");
        }
        this.length = length;
        this.sequence = new int[length];
        this.generateSequence();
    }

    private void generateSequence() {
        if (length == 1) {
            this.sequence[0] = 0;
            return;
        }
        if (length == 2) {
            this.sequence[0] = 0;
            this.sequence[1] = 1;
            return;
        }
        this.sequence[0] = 0;
        this.sequence[1] = 1;
        for (int i = 2; i < length; i++) {
            this.sequence[i] = this.sequence[i-1] + this.sequence[i-2];
        }
    }
    public int[] getSequence() {
        return sequence;
    }
    public int getNthTerm(int n) {
        if (n < 1 || n > length) {
            throw new IllegalArgumentException("dlina dolzna bit polozitelnim celim chislom >=length");
        }
        return sequence[n-1];
    }

    public String fibonacciSequenceFor() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(sequence[i]).append(" ");
        }
        return sb.toString();
    }

    public String fibonacciSequenceWhile() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < length) {
            sb.append(sequence[i]).append(" ");
            i++;
        }
        return sb.toString();
    }

    public String fibonacciSequenceDoWhile() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append(sequence[i]).append(" ");
            i++;
        } while (i < length);
        return sb.toString();
    }
}



//Написать класс FibonacciSequence, в котором есть поле length - длинна последовательности Фибоначчи.
//        Написать 3 метода в этом классе, возвращающих последовательность фибоначчи размера length в виде массива. Пример [0, 1, 1, 2, 3, 5] для length = 6.
//Каждый метод использует свой вариант цикла: 1 метод через цикл for, 2 через while, 3 через do-while.
//Написать конструктор с параметром и без параметров для этого класса. Не допускать возможность установки отрицательного значения length.

//        Написать программу (отдельный класс с методом main) в котором создать объект класса FibonacciSequence и протестировать работу всех получившихся методов.