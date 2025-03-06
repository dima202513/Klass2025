package KlassLedenevRoman.zadachaTesting_07_03_2025;

import java.util.Objects;

public class Product {
    private String name;
    private String sku;
    private String category;
    double price;
    double discountPercentage;

    public Product(String name, String sku, String category, double price, double discountPercentage) {
        this.name = name;
        this.sku = sku;
        this.category = category;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public String getName() {
        return name;
    }

    public String getSku() {
        return sku;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
public double getFinalPrice(){
        return price - ((price * discountPercentage) / 100);
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Double.compare(discountPercentage, product.discountPercentage) == 0 && Objects.equals(name, product.name) && Objects.equals(sku, product.sku) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sku, category, price, discountPercentage);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
//Дан класс Product с полями String name; String sku; String category;
// double price; double discountPercentage;
//В классе ProductServiceTest написать тесты для класса который выполняет
// следующие операции над списком Product
//List<Product> products = new ArrayList<>(List.of(
//        new Product("Laptop", "ABC-1234", "Electronics", 1200.99, 10),
//        new Product("Phone", "XYZ-5678", "Electronics", 799.49, 5),
//        new Product("Tablet", "TAB-9999", "Electronics", 499.99, 0),
//        new Product("Shoes", "SHO-1111", "Fashion", 59.99, 20),
//        new Product("Jacket", "JCK-2222", "Fashion", 119.99, 15),
//        new Product("Bread", "BRD-3333", "Food", 1.99, 0),
//        new Product("Milk", "MLK-4444", "Food", 2.49, 0),
//        new Product("Cheese", "CHS-5555", "Food", 5.99, 10),
//        new Product("Toy Car", "TOY-6666", "Toys", 19.99, 25)
//));
//
//- группирует товары по категории;
//- выдаёт топ3 самых дорогих товара;
//- выдаёт товары отсортированные по итоговой цене (с учётом скидки);
//- проверяет есть ли в списке товар с не правильным артикулом (sku – stock keeping unit), если есть выбрасывает ошибку InvalidSkuException с указанием у какого именно товара не правильный артикул;
//- выдаёт товары в определённом диапазоне цен min, max;
//- применяет скидку ко всем товарам определённых категорий;
//- определяет самую популярную категорию (по количеству товаров);
//- определяет самую дешёвую категорию (по средней цене со скидкой);
//- находит товары по ключевой строке (ключевая строка должна содержаться в названии либо категории либо цене)
