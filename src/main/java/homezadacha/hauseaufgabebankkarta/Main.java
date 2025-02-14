package homezadacha.hauseaufgabebankkarta;

public class Main {
    public static void main(String[] args) {
        String username;
        double balance;

        Atm atm = new Atm();

        DebitCard debitCard = new DebitCard("Vasilij Petrov", 1000.0);
        CreditCard creditCard = new CreditCard("Igor Ivanovich", 500.0);

        atm.displayBalance(debitCard);
        atm.displayBalanceInCurrency();
        atm.withdraw(debitCard, 1200.0);
        atm.withdraw(debitCard, 500.0);
        atm.displayBalance(debitCard);

        atm.displayBalance(creditCard);
        atm.withdraw(creditCard, 700.0);
        atm.displayBalance(creditCard);
    }


//        public Card(String username, double balance) {
//            this.username = username;
//            this.balance = balance;
//        }
//
//        public Card(String username) {
//            this(username, 0);
//        }

//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("balance up " + amount);
//        } else {
//            System.out.println(" must summa > 0 ");
//        }
//    }

//    public void displayBalance() {
//        System.out.println("current balance " + balance);
//    }

//    public void displayBalanceInCurrency(double exchangeRate, String currencyName) {
//        if (exchangeRate > 0) {
//            double convertedBalance = balance * exchangeRate;
//            System.out.println("ballance in currency " + currencyName + "--" + convertedBalance);
//        } else {
//            System.out.println("must be > 0 ");
//        }
//    }

}


//        Card card1 = new Card("Vasilij Petrov ", 1000.0);
//        card1.displayBalance();
//        card1.deposit(500.0);
//        card1.withdraw(300.0);
//        card1.displayBalanceInCurrency(0.93, "USD");
//
//        Card card2 = new Card("Igor Ivanovich");
//        card2.displayBalance();
//        card2.deposit(300.0);
//        card2.withdraw(70.0);
//        card2.displayBalanceInCurrency(1.2, "EUR");


//Домашнее, на базе прошлой домашней работы
//Сделать класс Card родителем,
//Определите два подкласса (наследника) CreditCard и DebitCard которые
// реализуют соотв. поведение :
//        •    дебетовая карта: не допускает снятие денег (уменьшение
//        баланса) если это приводит к отрицательному остатку на карте.
//        •    кредитная карта: допускает снятие со счета, даже если баланс
//        не положительный. Т.о., у владельца карты накапливается долг.
//        Также, реализуйте класс Банкомат (Atm) который, используя
//        переданную ему карту, позволяет проводить операции пополнения
//        /снятия/отображения.
//** Дополнительное условие, по желанию: Реализовать работу с пинкодом Карты
// (не допускать любые операции, если введён не верный пинкод)

//Определите два подкласса CreditCard и DebitCard которые реализуют соотв. поведение :
//        •       дебетовая карта: не допускает снятие денег (уменьшение баланса)
//        если это приводит к отрицательному остатку на карте.
//        •       кредитная карта: допускает снятие со счета, даже если баланс
//        не положительный. Т.о., у владельца карты накапливается долг.
//        Также, реализуйте класс Банкомат (Atm) который, используя переданную ему карту,
//        позволяет проводить операции пополнения/снятия.
//**
//Добавить работу с пинкодом Карты

//Создайте класс Карта, которая содержит имя пользователя и баланс
//Сделайте несколько конструкторов (перегрузка) для:
//        -создания карты с именем пользователя и балансом
//-создания карты с именем пользователя
//Сделайте методы для пополнения/снятия/отображения баланса
//Добавьте дополнительный метод для отображения баланса в различных валютах, передавая курс валюты