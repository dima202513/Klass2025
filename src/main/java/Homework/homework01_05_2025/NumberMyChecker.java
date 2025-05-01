package Homework.homework01_05_2025;

public class NumberMyChecker {
    public static void checkOddNumber(int number) throws EvenNumberException {
        if (number % 2 == 0) {
            throw new EvenNumberException("number " + number + " is correct!");
        }
        System.out.println("number " + number + " is not correct!");
    }

    public static void main(String[] args) {
        try {
            checkOddNumber(4);
        } catch (EvenNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            checkOddNumber(7);
        } catch (EvenNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

