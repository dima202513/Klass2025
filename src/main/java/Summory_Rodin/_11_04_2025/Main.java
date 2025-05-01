package Summory_Rodin._11_04_2025;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        //Объявляем поток ввода
        try(FileReader reader = new FileReader("C:/1/descr_climates.txt")) {
            //Объявляем объект для чтения потока ввода
            BufferedReader bufferedReader = new BufferedReader(reader);
            //Объявляем мапу для сохранения пар env_map и значений
            Map<String, String> map = new HashMap<>();
            //Превращаем весь файл в единый поток Stream API с помощью метода lines()
            // и сохраняем только строки с "env_map" и вкладываем в мапу
            AtomicInteger integer = new AtomicInteger(0);
            bufferedReader.lines().filter(s -> s.contains("env_map")).forEach(s -> {
                String[] arr = s.split("\t\t\t");
                map.put(arr[0]+integer.incrementAndGet(), arr[1]);
            });
            System.out.println(map);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
//try(FileReader reader = new FileReader("C:/1/descr_climates.txt")) {
//Объявляем объект для чтения потока ввода
//BufferedReader bufferedReader = new BufferedReader(reader);
//Объявляем мапу для сохранения пар env_map и значений
//Map<String, String> map = new HashMap<>();
//Превращаем весь файл в единый поток Stream API с помощью метода lines()
// и сохраняем только строки с "env_map" и вкладываем в мапу
//AtomicInteger integer = new AtomicInteger(0);
//    bufferedReader.lines().filter(s -> s.contains("env_map"))
//        .map(s -> s.split("\t\t\t")).forEach(arr -> map.put(arr[0], arr[1]));
//        System.out.println(map);
//} catch (IOException e){
//System.out.println(e.getMessage());
//        }

//char c = 'ы';
//System.out.println(Integer.toBinaryString(c));
//byte b = (byte)c;
//System.out.println(Integer.toBinaryString(b));
//char t = (char)b;
//System.out.println(Integer.toBinaryString(t));