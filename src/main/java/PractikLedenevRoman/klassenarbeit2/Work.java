package PractikLedenevRoman.klassenarbeit2;

import java.util.ArrayList;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        System.out.println("Find Max");
        int[] numbers = {4, 6, 9, 3, 6, 8};
        int max = findMax(numbers);
        System.out.println("findMax: " + max);
    }

    public static int findMax(List<Integer> array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static int findMaxInd(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0 && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // zadachi
    public static int positiveSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            if (element > 0 && element % 2 == 0) {
                sum += element;
            }
        }
        return sum;
    }

    public static double findMittelElements(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static List<Double> findMittelLow(double[] array, double average) {
        List<Double> elements = new ArrayList<>();
        for (double num : array) {
            if (num < average) {
                elements.add(num);
            }
        }
        return elements;
    }


    public static int summa(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.abs(array[i]);
        }
        System.out.println("summa modulej massiva: " + sum);
        return sum;
    }
}


//        В массиве, содержащем положительные и отрицательные целые числа,
//вычислить сумму четных положительных элементов
//
//Найти среднее арифметическое от всех элементов массива
//
//Найти в массиве те элементы, значение которых меньше среднего арифметического,
//взятого от всех элементов массива
//
//Вычислить сумму модулей элементов массива  (для вычисления модуля используйте Math.abs() )
//
//Найти номер минимального по модулю элемента массива
//
//В массиве целых чисел определить два наименьших элемента. Они могут быть как равны
//между собой (оба являться минимальными), так и различаться