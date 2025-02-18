package PractikLedenevRoman.klassenarbeit0;

public class Calkulator {
    public String getResult(String input) {
        int operationsCount = getOperationCount(input);
        char[] operations = getOperators(input, operationsCount);
        double[] numbers = getNumbers(input, operationsCount);
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = calculate(result, numbers[i], operations[i - 1]);

        }
        return getFinalResult(operations, numbers, result);

    }

    private String getFinalResult(char[] operations, double[] numbers, double result) {
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < numbers.length -1; i++) {
            resultBuilder.append(numbers[i]).append(" ").append(operations[i]).append(" ");
        }
        resultBuilder.append(numbers[numbers.length-1]).append(" ").append("=").append(" ").append(result);
        return resultBuilder.toString();
    }

    private double calculate(double result, double number, char operation) {
        return switch (operation) {
            case '+' -> result + number;
            case '-' -> result - number;
            case '*' -> result * number;
            case '/' -> result / number;
            default -> 0;
        };
    }


    private char[] getOperators(String input, int operationCount) {
        int indexOfOperators = 0;

        char[] operators = new char[operationCount];
        for (int i = 0; i < input.length(); i++) {
            if (isOperation(input.charAt(i))) {
                operators[indexOfOperators] = input.charAt(i);
                indexOfOperators++;
            }
        }
        return operators;
    }


    private double[] getNumbers(String input, int operationCount) {
        double[] numbers = new double[operationCount + 1];
        int start = 0;
        int indexNumber = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (input.length() - 1 == i) {
                String stringNumber = input.substring(start);
                double number = Double.parseDouble(stringNumber);
                numbers[indexNumber] = number;
            }

            if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                String stringNumber = input.substring(start, i);
                double number = Double.parseDouble(stringNumber);
                numbers[indexNumber] = number;
                indexNumber++;
                start = i + 1;

            }
        }
        return numbers;
    }

    private int getOperationCount(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (isOperation(input.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    private boolean isOperation(char currentChar) {
        return currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/';
    }
}
/**
 * Написать программу “Калькулятор” таким образом, что бы она принимала
 * от пользователя вычисляемое математическое выражение в виде одной
 * строки. Например 10.5*5+1-7.1 (без пробелов) и последовательно
 * выполняла бы указанные арифметические операции над аргументами.
 * Результат вычислений необходимо вывести с точностью до двух чисел
 * после запятой <значение аргумента 1> <знак математической
 * операции> <значение аргумента 2> = <значение переменной результата>   (добавлены пробелы относительно введённой строки) 10.5*5+1-7.1
 * 10.5 * 5 + 1  -7.1 = 15.41
 */