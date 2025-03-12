package Homework.Praktika_s_Yrij_homework._06_03_2025.ATM;

public class ATM {

    private int balance = 100;

    public int loadMoney(int amount) {
        balance = balance + amount;
        return balance;
    }


    public int withdrawMoney(int amount) {
        if (amount < 0){
            throw new IllegalArgumentException();
        }
        if (balance > amount) {
            balance = balance - amount;
        } else {
            amount = balance;
            balance = 0; //  balance dolzen izmenyatsya (--> 0)
        }
        return amount;

    }

}
