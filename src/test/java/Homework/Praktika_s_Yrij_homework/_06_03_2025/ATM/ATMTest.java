package Homework.Praktika_s_Yrij_homework._06_03_2025.ATM;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    private final ATM atm = new ATM();
//    @BeforeEach
//    void setUp() {
//        atm = new ATM(); // Новый банкомат перед каждым тестом
//        atm.loadMoney(100); // Загружаем 100 перед каждым тестом
//    }
    @Test
    void putMoneyToATM() {
        int sum = atm.loadMoney(100);
        Assertions.assertEquals(200, sum);
    }

    @Test
    void withdrawMoney() {
        int sum = atm.withdrawMoney(40);
        Assertions.assertEquals(40, sum);
    }

    @Test
    void withdrawMoneyWhenAmountMoreThanBalance() {
//        ATM atm = new ATM();//100 na balance
        int sum = atm.withdrawMoney(140);// vernulos 100
        Assertions.assertEquals(100, sum);
        // balance 0
        sum = atm.withdrawMoney(140); // vtoraya popytka sjema
        Assertions.assertEquals(0, sum);

    }

    @Test
    void withdrawMoneyWhenAmountIsNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> atm.withdrawMoney(-140));
    }

    //given


    //when


    //then


}