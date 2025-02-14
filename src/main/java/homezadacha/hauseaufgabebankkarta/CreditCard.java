package homezadacha.hauseaufgabebankkarta;

public class CreditCard extends Card {
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
//            System.out.println("withdraw from account " + amount);
//        } else if (amount > balance) {
//            System.out.println("not enough in account ");
        } else {
            System.out.println("must summe > 0 ");
        }
    }
//    @Override
//    public void withdraw(double amount) {
//        super.withdraw(amount);
//    }

    public CreditCard(String username, double balance) {
        super(username, balance);

    }

}
