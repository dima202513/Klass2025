package KlassLedenevRoman._14_03_2025_klass;

public class Main {

    public static void main(String[] args) {
        User admin = new User("Vasya", Role.ADMIN);
        User customer = new User("Sacha", Role.CUSTOMER);

        Order order1 = new Order(admin);
        Order order2 = new Order(customer);
        Order order3 = new Order(customer);

        order1.add(Item.HEADPHONES);
        order1.add(Item.KEYBOARD);

        order1.add(Item.HEADPHONES, 5);
        order1.decrease(Item.HEADPHONES);
        order1.increase(Item.KEYBOARD);
        order1.remove(Item.KEYBOARD);
        order1.changeStatus();
        order1.cancel();
        System.out.println(order1.getTotalAmount());
        System.out.println(Storage.getOrders(customer));
        System.out.println(Storage.getOrders(admin));

        System.out.println(order1);
    }
}
//
//попробовать изменить логику метода getOrders в классе Storage, что бы задействовать абстрактный метод canViewOrder(Order order) в enum
//canViewOrder(Order order, User user)
//vozvrat
//boolean canViewOrder(Order order, User user)


//
//Ваша задача – создать систему управления заказами (Order). Заказ может находиться в разных состояниях enum OrderStatus, а также у него есть Map<Item, Integer> где Item это enum товаров с ценой, а Integer – количество.
//Вам нужно реализовать классы, методы и логику переходов между статусами заказа.
//
//enum OrderStatus
//NEW – заказ создан
//PROCESSING – заказ в обработке
//SHIPPED – заказ отправлен
//DELIVERED – заказ доставлен
//CANCELED – заказ отменён
//enum Item
//придумать самостоятельно

//class Order
//int id; String customerName; Map<Item, Integer> items; OrderStatus status;
//
//Создать метод next(), который получает следующее состояние:
//        -    NEW → PROCESSING → SHIPPED → DELIVERED
//-    CANCELED и DELIVERED – конечные состояния.
//Создать методы:
//        -          add который добавляет товар; перегрузить его что бы была возможность добавить товар в нужном количестве.
//-          increase который увеличивает количество переданного товара на 1.
//        -          decrease уменьшает количество переданного товара на 1, если количество опустилось до 0, удаляет товар из заказа.
//        -          remove удаляет переданный товар в любом количестве из заказа.
//-          changeStatus изменяет статус заказа на следующий, и если статус заказа изменился выводит сообщение в консоль в формате "Заказ №<id> статус: <oldStatus> → <newStatus>“.
//        -          cancel отменяет заказ, если он ещё не перешёл в статус отправлен.
//        -          getTotalAmount получает цену заказа
//дополнительно:
//        -          создать класс хранилище с статическим полем List<Order>, при создании каждого Order добавлять его в хранилище.
//        -          добавить класс User с именем и ролью (enum ADMIN, CUSTOMER), и передавать его в конструктор Order вместо customerName.
//        -          модифицировать программу таким образом, что бы из хранилища ADMIN получал все заказы, а CUSTOMER только свои.