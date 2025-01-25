package homezadacha2.fibonacciIspravil;

public class FibonacciSequence {
    private int length;   //sozdat pustoj kostruktor

    public FibonacciSequence() {
    }

        public FibonacciSequence(int length) {
            if (length <= 0) {
                throw new IllegalArgumentException("must be positive");
            }
            this.length = length;
        }

        public int[] fibonacciSequenceFor() {
            int[] sequence = new int[length];
            if (length > 0) {
                sequence[0] = 0;
            }
            if (length > 1) {
                sequence[1] = 1;
            }
            for (int i = 2; i < length; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
            return sequence;
        }

        public int[] fibonacciSequenceWhile() {
            int[] sequence = new int[length];
            if (length > 0) {
                sequence[0] = 0;
            }
            if (length > 1) {
                sequence[1] = 1;
            }
            int i = 2;
            while (i < length) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
                i++;
            }
            return sequence;
        }

        public int[] fibonacciSequenceDoWhile() {
            int[] sequence = new int[length];
            if (length > 0) {
                sequence[0] = 0;
            }
            if (length > 1) {
                sequence[1] = 1;
            }
            int i = 2;
            do {
                if (i >= length) {
                    break;
                }
                sequence[i] = sequence[i - 1] + sequence[i - 2];
                i++;
            } while (i < length);
            return sequence;
        }
}

//о условию у вас в классе должно быть только поле length и всё
//не нужно выносить private int[] sequence; в поле класса
//вы прямо в методах с циклами for, while и do-while должны создавать массив
// нужной длины, и заполнять его числами фибоначчи. Все ваши методы с циклами должны возвращать массив
//а уже в мэйне через Arrays.toString вы эти массивы печатаете