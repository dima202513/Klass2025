package Homework.klass07_03;

import KlassLedenevRoman.zadachaTesting_07_03_2025.Product;
import KlassLedenevRoman.zadachaTesting_07_03_2025.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductServiceTest {

    private static final ProductService PRODUCT_SERVICE = new ProductService();

    private static final List<Product> PRODUCTS = new ArrayList<>(List.of(
            new Product("Laptop", "ABC-1234", "Electronics", 1200.99, 10),
            new Product("Phone", "XYZ-5678", "Electronics", 799.49, 5),
            new Product("Tablet", "TAB-9999", "Electronics", 499.99, 0),
            new Product("Shoes", "SHO-1111", "Fashion", 59.99, 20),
            new Product("Jacket", "JCK-2222", "Fashion", 119.99, 15),
            new Product("Bread", "BRD-3333", "Food", 1.99, 0),
            new Product("Milk", "MLK-4444", "Food", 2.49, 0),
            new Product("Cheese", "CHS-5555", "Food", 5.99, 10),
            new Product("Toy Car", "TOY-6666", "Toys", 19.99, 25)
    ));

    @Test
    void groupByCategoryTest() {
        //given
        Map<String, List<Product>> expected = Map.of(
                "Electronics",
                List.of(new Product("Laptop", "ABC-1234", "Electronics", 1200.99, 10),
                        new Product("Phone", "XYZ-5678", "Electronics", 799.49, 5),
                        new Product("Tablet", "TAB-9999", "Electronics", 499.99, 0)),

                "Fashion",
                List.of(new Product("Shoes", "SHO-1111", "Fashion", 59.99, 20),
                        new Product("Jacket", "JCK-2222", "Fashion", 119.99, 15)),

                "Food",
                List.of(new Product("Bread", "BRD-3333", "Food", 1.99, 0),
                        new Product("Milk", "MLK-4444", "Food", 2.49, 0),
                        new Product("Cheese", "CHS-5555", "Food", 5.99, 10)),

                "Toys", List.of(new Product("Toy Car", "TOY-6666", "Toys", 19.99, 25)));

        //when
        Map<String, List<Product>> actual = PRODUCT_SERVICE.groupByCategory(PRODUCTS);

        //then
        Assertions.assertEquals(expected, actual);
    }
@Test
    void getSortedByFinalPriceTest(){
//given
    List<Product> expected = List.of(new Product("Bread", "BRD-3333", "Food", 1.99, 0),
            new Product("Milk", "MLK-4444", "Food", 2.49, 0),
            new Product("Cheese", "CHS-5555", "Food", 5.99, 10),
            new Product("Toy Car", "TOY-6666", "Toys", 19.99, 25),
            new Product("Shoes", "SHO-1111", "Fashion", 59.99, 20),
            new Product("Jacket", "JCK-2222", "Fashion", 119.99, 15),
            new Product("Tablet", "TAB-9999", "Electronics", 499.99, 0),
            new Product("Phone", "XYZ-5678", "Electronics", 799.49, 5),
            new Product("Laptop", "ABC-1234", "Electronics", 1200.99, 10));
//when
    List<Product> actual = PRODUCT_SERVICE.getSortedByFinalPrice(PRODUCTS);

    //then
    Assertions.assertEquals(expected, actual);
    }
    @Test
    void getThreeMostExpensiveProduct(){
        List<Product> expected = List.of(
                new Product("Laptop", "ABC-1234", "Electronics", 1200.99, 10),
                new Product("Phone", "XYZ-5678", "Electronics", 799.49, 5),
                new Product("Tablet", "TAB-9999", "Electronics", 499.99, 0));

//given
    //when
    List<Product> actual = PRODUCT_SERVICE.getThreeMostExpensiveProduct(PRODUCTS);

    //then
Assertions.assertEquals(expected, actual);
    }

}


//
//- группирует товары по категории;
//- выдаёт топ3 самых дорогих товара;
//- выдаёт товары отсортированные по итоговой цене (с учётом скидки);
//- проверяет есть ли в списке товар с не правильным артикулом
// (sku – stock keeping unit), если есть выбрасывает ошибку
// InvalidSkuException с указанием у какого именно товара не правильный артикул;
//- выдаёт товары в определённом диапазоне цен min, max;
//- применяет скидку ко всем товарам определённых категорий;
//- определяет самую популярную категорию (по количеству товаров);
//- определяет самую дешёвую категорию (по средней цене со скидкой);
//- находит товары по ключевой строке (ключевая строка должна содержаться в названии либо категории либо цене)
