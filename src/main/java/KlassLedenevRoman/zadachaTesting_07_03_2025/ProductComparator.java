package KlassLedenevRoman.zadachaTesting_07_03_2025;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return (int) (product1.getFinalPrice() * 100 - product2.getFinalPrice() * 100);
    }
}
