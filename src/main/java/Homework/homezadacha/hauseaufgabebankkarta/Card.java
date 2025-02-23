package Homework.homezadacha.hauseaufgabebankkarta;

public abstract class Card {
    protected String username;
    protected double balance;

    public Card(String username, double balance) {
        this.username = username;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(username + "add balance " + amount);
        } else {
            System.out.println("summa > 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println(username + " withdeaw " + amount);
        } else {
            System.out.println("summa > 0 ");
        }
    }
//
    public void displayBalance() {
        System.out.println(username + "balance now " + balance);
    }
    public void displayBalanceInCurrency(double exchangeRate, String currency) {
        if (exchangeRate > 0) {
            double convertedBalance = balance * exchangeRate;
            System.out.println(username + " balance in " + currency + ": " + convertedBalance);
        } else {
            System.out.println("Exchange rate must be greater than 0");
        }
    }

}

//Добавьте дополнительный метод для отображения баланса в различных валютах, передавая курс валюты
//Сделать класс Card родителем,
//Определите два подкласса (наследника) CreditCard и DebitCard которые реализуют соотв. поведение :
//        •    дебетовая карта: не допускает снятие денег (уменьшение баланса) если это приводит к
//        отрицательному остатку на карте.
//        •    кредитная карта: допускает снятие со счета, даже если баланс не положительный. Т.о.,
//        у владельца карты накапливается долг.
//        Также, реализуйте класс Банкомат (Atm) который, используя переданную ему карту, позволяет
//        проводить операции
//        пополнения/снятия/отображения.