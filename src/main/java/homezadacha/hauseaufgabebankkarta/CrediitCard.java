package homezadacha.hauseaufgabebankkarta;

public class CrediitCard extends Card {
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    public CrediitCard(String username, double balance) {
        super(username, balance);

    }
}
