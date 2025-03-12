package KlassLedenevRoman.zadachaTesting_07_03_2025;

import java.util.*;

public class ProductService {

    public Map<String, List<Product>> groupByCategory(List<Product> products) {
        Map<String, List<Product>> categoryProductsMap = new HashMap<>();
        for (Product product : products) {
            categoryProductsMap.putIfAbsent(product.getCategory(), new ArrayList<>());
            categoryProductsMap.get(product.getCategory()).add(product);

//            if (!categoryProductsMap.containsKey(product.getCategory())){
//                List<Product> groupedProducts = new ArrayList<>();
//                groupedProducts.add(product);
//                categoryProductsMap.put(product.getCategory(), new ArrayList<>(List.of(product)));
//            }else {
//                List<Product> groupedProducts = categoryProductsMap.get(product.getCategory());
//                groupedProducts.add(product);
//            }
        }
        return categoryProductsMap;
    }

    public List<Product> getSortedByFinalPrice(List<Product> products) {
        List<Product> result = new ArrayList<>(products);
        Comparator<Product> productComparator = new ProductComparator();
        result.sort(productComparator);
        return result;
    }

    public List<Product> getThreeMostExpensiveProduct(List<Product> products) {
        List<Product> sorted = new ArrayList<>(products);
        Comparator<Product> productComparator = new ProductComparator();
        sorted.sort(productComparator.reversed());

        if (sorted.size() < 3) {
            return sorted;
        }
        return sorted.subList(0, 3);
    }

    public void checkValidSKU(List<Product> products) {
        for (Product product : products) {// "ABC-1234"
            if (!product.getSku().matches("[A-Z]{3}-\\d{4}")) {
                throw new InvalidSKUExceptions("SKU of " + product.getName() + " is Invalid");
            }
        }
    }
}
