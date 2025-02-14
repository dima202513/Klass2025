package _2025_02_13klass;

import _2025_01_14klass.Student;
import _2025_01_16Klass.Car;

public class Main1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        System.out.println(a == b);

        Student student1 = new Student(20, "Oleg");
        Student student2 = new Student(20, "Oleg");
        System.out.println(student1 == student2);

        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1 == string2);

        System.out.println(string2);
        string2 = string2.replace("o", "a");  // "Hella"
        System.out.println(string2);

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        string2 = string2.intern();
        System.out.println(string1 == string2);

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                break;
            }
            System.out.println(arr[i]);
        }

        System.out.println("end");

        Car car1 = new Car("BMW", "x5", 1999);
        /*        car1.model = "BMC";*/
    }

    public static String print(String string) {
        System.out.println(string);
        if (string == null) {
            return null;
        } else {
            return string;
        }
    }
}