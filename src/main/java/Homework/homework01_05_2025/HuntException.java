package Homework.homework01_05_2025;

public class HuntException {

        public static void main(String[] args) {
            try {
                parseError("hggfdkghf");
            } catch (ExceptionOne e) {
                e.printStackTrace();
            }
        }

        public static void parseError(String input) {
            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                throw new ExceptionOne("Error: " + input, e);
            }
        }
    }
// poyavilis exception v konsoli.... escho nado chto?

