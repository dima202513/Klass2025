package zadacha_v_klasse5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static final int TEN = 10;
    private static final int FIVE = 5;
    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @Test
    void sumTest() {
        //given
        int expected = 15;

        //when
        int actual = calculator.sum(TEN, FIVE);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void subtractTest() {
        //given
        int expected = 5;

        //when
        int actual = calculator.subtract(TEN, FIVE);

        //then
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void divideNegativeCase(){
        //given
        int zero = 0;
        //then
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(TEN, zero));
    }


}