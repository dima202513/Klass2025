package Homework.homezadacha.Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("give 3 numbers:");
        int algorithmId = scanner.nextInt();
        int loopType = scanner.nextInt();
        int n = scanner.nextInt();
        switch (algorithmId) {
            case 1:
                System.out.println("fibonacci");
                switch (loopType) {
                    case 1:
                        fibonacciWhile(n);
                        break;
                    case 2:
                        fibonacciDoWhile(n);
                        break;
                    case 3:
                        fibonacciFor(n);
                        break;
                    default:
                        System.out.println("invalid cycle");
                }
                break;
            case 2:
                System.out.println("factorial");
                switch (loopType) {
                    case 1:
                        factorialWhile(n);
                        break;
                    case 2:
                        factorialDoWhile(n);
                        break;
                    case 3:
                        factorialFor(n);
                        break;
                    default:
                        System.out.println("invalid cycle");
                }
                break;
            default:
                System.out.println("invalid algorithm");
        }
    }


    public static void fibonacciWhile(int n) {
        int a = 0, b = 1, count = 0;
        while (count < n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
        System.out.println();
    }

    public static void fibonacciDoWhile(int n) {
        int a = 0, b = 1, count = 0;
        do {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        } while (count < n);
        System.out.println();
    }

    public static void fibonacciFor(int n) {
        int a = 0, b = 1;
        for (int count = 0; count < n; count++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }


    public static void factorialWhile(int n) {
        int result = 1, i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println(result);
    }

    public static void factorialDoWhile(int n) {
        int result = 1, i = 1;
        do {
            result *= i;
            i++;
        } while (i <= n);
        System.out.println(result);
    }

    public static void factorialFor(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}

