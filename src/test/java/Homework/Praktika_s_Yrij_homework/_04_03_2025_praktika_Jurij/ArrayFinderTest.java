package Homework.Praktika_s_Yrij_homework._04_03_2025_praktika_Jurij;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//проверить, когда массив null
//когда только отрицательные

class ArrayFinderTest {
    private final ArrayFinder finder = new ArrayFinder();

    @Test
    void getMax() {
        int[] array = {-4, 4, 2, 56, 42, 78, 33, 15, -1, -8, 15};
        Assertions.assertEquals(78, finder.getMax(array));
    }

    @Test
    void getMin() {
        int[] array = {-4, 4, 2, 56, 42, 78, 33, 15, -1, -8, 15};
        Assertions.assertEquals(-8, finder.getMin(array));
    }

    @Test
    void testMaxSingleElement(){
        int[] array = {10};
        Assertions.assertEquals(10, finder.getMax(array));
    }
    @Test
    void testMinSingleElement(){
        int[] array = {10};
        Assertions.assertEquals(10, finder.getMin(array));
    }
    @Test
    void testGetMaxWhenArrayIsEmpty(){
        int[] array = {10};
        Assertions.assertThrows(IllegalArgumentException.class, ()-> finder.getMax(array));
    }
    @Test
    void testGetMaxWhenArrayNull(){
        int[] array = {10};
        Assertions.assertThrows(IllegalArgumentException.class, ()-> finder.getMax(array));
    }

    @Test
    void testGetMaxWhenArrayPositiv(){
        int[] array = {10};
        Assertions.assertThrows(IllegalArgumentException.class, ()-> finder.getMax(array));
    }
    @Test
    void testGetMaxWhenArrayNegativ(){

    }
//    s null
//    kogda chisla -
//    kogda chisla +
}
