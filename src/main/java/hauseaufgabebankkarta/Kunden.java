package hauseaufgabebankkarta;

public class Kunden {
    private String kundenName;
    private double balance;
    private double konto;

    public String getKundenName() {
        return kundenName;
    }
    public double getBalance() {
        return balance;
    }
    public double getKonto() {
        return konto;
    }
    public Kunden(String name, double konto, double balance) {
        this.kundenName = name;
        this.konto = konto;
        this.balance = balance;
    }
}
