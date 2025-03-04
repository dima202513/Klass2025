package Homework.Praktika_s_Yrij_homework._04_03_2025_praktika_Jurij;

public class MaxMinApp {

    public static void main(String[] args) {
        ArrayFinder arrayFinder = new ArrayFinder();
        int[] array = {-4, 4, 2, 56, 42, 78, 33, 15, -1, -8, 15};
        System.out.println("Min element " + arrayFinder.getMin(array));
        System.out.println("Max element " + arrayFinder.getMax(array));
    }

}
//Реализовать два данных метода
//Написать на эти методы тесты!!!