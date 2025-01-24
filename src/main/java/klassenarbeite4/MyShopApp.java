package klassenarbeite4;

public class MyShopApp {
    public static void main(String[] args) {
Item apple = new Item("apple",1.5,  16);
Item banan = new Item("apple",1.5,  16);
Item orange = new Item("apple",1.5, 16.0);

Item[] items = {apple,banan,orange};
Category category = new Category("fruit", items);
Item carrots = new Item("carrot", 7, 31);
Item gurke = new Item("gurke", 0.5, 34);
Item tomato = new Item("tomato", 8, 23);
Item[] vegetables = {gurke,carrots, tomato};
Category vegetableCategory = new Category("vegetable", vegetables);

User user = new User("dima", "kod", new Bascet());
Bascet bascet = user.getBascet();
bascet.addItem(apple);
bascet.addItem(banan);;
bascet.addItem(carrots);
        System.out.println("bascet: " + bascet.getTotalPrice());
        System.out.println("bascet: " + bascet.getTotalRating());
    }
}


//Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//        б) Создать класс Категория, имеющий переменные имя и массив товаров.
//в) Создать класс Basket, содержащий массив купленных товаров.
//г) Создать класс User, содержащий логин, пароль и объект класса Basket.
//Создать несколько объектов класса Категория. Создать объект класса User
// и инициализировать все его поля, и посчитайте суммарную цену товаров,
// и средний рейтинг покупок.