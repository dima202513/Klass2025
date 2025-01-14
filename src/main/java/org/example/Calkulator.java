package org.example;

import java.util.Scanner;

public class Calkulator {
    public String getResult(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                counter++;
            }
        }
        double[] numbers = new double[counter + 1];
        char[] operators = new char[counter];
        int start = 0;
        int indexNumber = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                String stringNumber = input.substring(start, i);
                double number = Double.parseDouble(stringNumber);
                numbers[indexNumber] = number;
                indexNumber ++;
                start = i+1;

            }
        }return null;
    }
}
/**
 * Написать программу “Калькулятор” таким образом, что бы она принимала
 * от пользователя вычисляемое математическое выражение в виде одной
 * строки. Например 10.5*5+1-7.1 (без пробелов) и последовательно
 * выполняла бы указанные арифметические операции над аргументами.
 * Результат вычислений необходимо вывести с точностью до двух чисел
 * после запятой в формате <значение аргумента 1> <знак математической
 * операции> <значение аргумента 2> = <значение переменной результата>   (добавлены пробелы относительно введённой строки) 10.5*5+1-7.1
 * 10.5 * 5 + 1  -7.1 = 15.41
 */