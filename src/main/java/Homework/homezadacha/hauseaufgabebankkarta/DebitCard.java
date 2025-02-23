package Homework.homezadacha.hauseaufgabebankkarta;

public class DebitCard extends Card {
    public DebitCard(String username, double balance) {
        super(username, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(username + " withdraw " + amount);
        } else {
            System.out.println("summa > 0 ");
        }
    }
}
