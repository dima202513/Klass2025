package Homework.homezadacha.hauseaufgabebankkarta;

public class Atm {
    private Card card;

    public void setCard(Card card) {
        this.card = card;
        System.out.println("Card " + card.getUsername() + " Go");
    }
    public void removeCard() {
        if (card != null) {
            System.out.println("Card " + card.getUsername() + " is off");
            card = null;
        } else {
            System.out.println("no Card.");
        }
    }
    public void withdraw(double amount) {
        if (card == null) {
            System.out.println("enter karte");
            return;
        }
        card.withdraw(amount);
    }
    public void deposit(double amount) {
        if (card == null) {
            System.out.println("please Card");
            return;
        }
        card.deposit(amount);
    }

    public void displayBalance() {
        if (card == null) {
            System.out.println("please Card");
            return;
        }
        card.displayBalance();
    }
    }





