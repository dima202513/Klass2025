package homezadacha.hauseaufgabebankkarta;

public class Card {

    protected String username;
    protected double balance;

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
    public void displayBalance(){
        System.out.println(username + "balance now " + balance);
    }
    public static void main(String[] args) {
        Atm atm = new Atm();

        DebitCard debitCard = new DebitCard("Василий Петров", 1000.0);
        CrediitCard creditCard = new CrediitCard("Игорь Иванович", 500.0);

        atm.displayBalance(debitCard);
        atm.withdraw(debitCard, 1200.0);
        atm.withdraw(debitCard, 500.0);
        atm.displayBalance(debitCard);

        atm.displayBalance(creditCard);
        atm.withdraw(creditCard, 700.0);
        atm.displayBalance(creditCard);
    }
}


//Сделать класс Card родителем,
//Определите два подкласса (наследника) CreditCard и DebitCard которые реализуют соотв. поведение :
//        •    дебетовая карта: не допускает снятие денег (уменьшение баланса) если это приводит к
//        отрицательному остатку на карте.
//        •    кредитная карта: допускает снятие со счета, даже если баланс не положительный. Т.о.,
//        у владельца карты накапливается долг.
//        Также, реализуйте класс Банкомат (Atm) который, используя переданную ему карту, позволяет
//        проводить операции
//        пополнения/снятия/отображения.