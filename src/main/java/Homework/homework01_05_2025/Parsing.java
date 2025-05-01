package Homework.homework01_05_2025;

public class Parsing {

    public static void Parsing100Numbers(String input) {
        try {
            int number = Integer.parseInt(input);
            int result = 100 / number;

            System.out.println("result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("error: not number");
        } catch (ArithmeticException e) {
            System.out.println("error: !%2");
        }
    }

    public static void main(String[] args) {
        Parsing100Numbers("25");
        Parsing100Numbers("0");
        Parsing100Numbers("hgfdkghf");
    }
}
