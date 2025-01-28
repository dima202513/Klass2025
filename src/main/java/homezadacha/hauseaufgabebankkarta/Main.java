package homezadacha.hauseaufgabebankkarta;

public class Main {
    public static class Card {


        private String username;
        private double balance;

        public Card(String username, double balance) {
            this.username = username;
            this.balance = balance;
        }

        public Card(String username) {
            this(username, 0);
        }


        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("balance up " + amount);
            } else {
                System.out.println(" must summa > 0 ");
            }
        }


        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("withdraw from account " + amount);
            } else if (amount > balance) {
                System.out.println("not enough in account ");
            } else {
                System.out.println("must summe > 0 ");
            }
        }

        public void displayBalance() {
            System.out.println("current balance " + balance);
        }

        public void displayBalanceInCurrency(double exchangeRate, String currencyName) {
            if (exchangeRate > 0) {
                double convertedBalance = balance * exchangeRate;
                System.out.println("ballance in currency " + currencyName + "--" + convertedBalance);
            } else {
                System.out.println("must be > 0 " );
            }
        }

    }
        public static void main(String[] args) {
            Card card1 = new Card("Vasilij Petrov ", 1000.0);
            card1.displayBalance();
            card1.deposit(500.0);
            card1.withdraw(300.0);
            card1.displayBalanceInCurrency(0.013, "USD");

            Card card2 = new Card("Igor Ivanovich");
            card2.displayBalance();
            card2.deposit(300.0);
            card2.withdraw(70.0);
            card2.displayBalanceInCurrency(0.85, "EUR");
        }

}


//Создайте класс Карта, которая содержит имя пользователя и баланс
//Сделайте несколько конструкторов (перегрузка) для:
//        -создания карты с именем пользователя и балансом
//-создания карты с именем пользователя
//Сделайте методы для пополнения/снятия/отображения баланса
//Добавьте дополнительный метод для отображения баланса в различных валютах, передавая курс валюты