package homezadacha.hauseaufgabebankkarta;

public class Atm extends Card {
    public Atm(Card card) {
        this.card = card;
    }

    public Atm(String username, double balance) {
        super(username, balance);
    }

    private Card card; // Поле для хранения карты

    public Atm() {

    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void withdraw(double amount) {
        if (card == null) {
            System.out.println("enter karte");
            return;
        }
        card.withdraw(amount);
    }

    public void removeCard() {
        this.card = null;
        System.out.println("karte is off.");
    }


    public void deposit(Card card, double amount) {
        card.deposit(amount);
    }

    public void withdraw(Card card, double amount) {
        card.withdraw(amount);
    }

    public void displayBalance(Card card) {
        card.displayBalance();
    }

    @Override
    public void displayBalanceInCurrency(double exchangeRate, String currency) {
        super.displayBalanceInCurrency(exchangeRate, currency);
    }

    public void displayBalanceInCurrency() {
    }
}
