package homezadacha.hauseaufgabebankkarta;

public class Atm {
    public void deposit(Card card, double amount) {
        card.deposit(amount);
    }

    public void withdraw(Card card, double amount) {
        card.withdraw(amount);
    }

    public void displayBalance(Card card) {
        card.displayBalance();
    }
}
