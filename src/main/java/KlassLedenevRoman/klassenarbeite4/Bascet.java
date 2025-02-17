package KlassLedenevRoman.klassenarbeite4;

public class Bascet {
    private Item[] choosedItems = new Item[0];

    public Bascet(Item[] choosedItems) {
        this.choosedItems = choosedItems;
    }

    public Bascet() {
    }
    public void addItem(Item item) {
int currentSize = choosedItems.length;
        Item[] newItems = new Item[currentSize + 1];
        for (int i = 0; i < currentSize; i++) {
            newItems[i] = choosedItems[i];
        }
        newItems[newItems.length - 1] = item;
        choosedItems = newItems;
    }

    public Item[] getChoosedItems() {
        return choosedItems;
    }
    public double getTotalPrice() {
        double result = 0;
        for (int i = 0; i < choosedItems.length; i++) {
            result += choosedItems[i].getPrice();
        }return result;
//        double Result = 0;
//        for (Item item : choosedItems) {
//            Result += item.getPrice();
//        }
//        return Result;

    }
    public double getTotalRating() {
        double result = 0;
        for (int i = 0; i < choosedItems.length; i++) {
            result += choosedItems[i].getRating();
        }
        return result / choosedItems.length;

    }
}
