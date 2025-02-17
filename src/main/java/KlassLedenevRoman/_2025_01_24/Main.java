package KlassLedenevRoman._2025_01_24;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Sonya", 6, "Ginger");
        Dog dog = new Dog("Boston", 5, "cocker spaniel");
        Mouse mouse = new Mouse("Stuart little", 2);
        Human human = new Human("richard", 34);
        Robot robot = new Robot("R202");
        Creature[] creatures = {cat, dog, robot, human, mouse};
        AnimalWalker[] animalWalker = {human, robot};
        Animal[] animal = {cat, dog};
        MouseCatcher[] catCatcher = {cat, robot};
        Animated[] animated = {cat, dog, human, mouse};

        human.feed(cat);
        human.feed(cat, dog, mouse);
        human.feed(animal);
        human.feed(dog);
        System.out.println("----------------------");

        greetings(creatures);
    }

    public static void greetings(Creature[] creatures) {
        for (Creature creature : creatures) {
            creature.sayHello();
        }
    }
}

//Создайте систему классов которая будет представлять собой жителей дома.
//        Классы Cat, Dog, Mouse, Human, Robot. Абстракции придумать самостоятельно.
//
//Каждое существо должно:
//        -иметь имя.
//        -уметь представляться (метод sayHello) – в котором выводится в консоль имя и представление существа.
//        Например: для кота “Meow! I'm cat. My name is <имя>"; для собаки “Bark! I'm dog. My name is <имя>”;
//        и далее для остальных по аналогии.
//        -уметь играть с другим существом (метод play, который принимает другое существо для игры) – в котором
//        по умолчанию выводится сообщение “ <имя1> playing with <имя2>” (если играют кот и собака, то выводить
//        “ Dog <имя1> barks. Cat <имя2> runs away”).

//Каждое одушевлённое существо (все кроме робота) должно:
//        -иметь возраст,
//-уметь стареть (метод grow) при вызове которого возраст увеличивается на 1, а так же выводится сообщение “<имя>
// is getting older by 1 year”.
//Каждое животное должно:
//        -иметь булевый параметр isHungry,
//-уметь есть (метод eat) при вызове которого, в зависимости от параметра isHungry выводить сообщение "<имя> eats"
// либо "<имя> doesn't want to eat". Если животное поело – менять параметр isHungry на false.
//Человек должен уметь кормить (метод feed) одно или несколько животных, которые были переданы в метод. В методе
// у каждого животного вызывается метод eat.
//Человек и робот должны уметь выгуливать животное (метод walkAnimal), которое передаётся в метод. Вывести сообщение
// "<имя1>  walking with <имя2> ". После прогулки животное проголодается, перевести isHungry на true.

//Кот и робот должны уметь ловить мышь (метод catchMouse), которая передаётся в метод. Вывести сообщение "<имя1>
// catches mouse <имя2> "
//Реализовать абстракции так, что бы характеристики и тела методов в классах не повторялись.
//В классе HouseApp, в мэйн методе создать объекты всех возможных существ, а так же методы:
//        -greetings – метод в котором у всех существ вызывается sayHello
//-playEachOther – метод в котором все существа поочерёдно играют друг с другом
//- метод walkAnimals – в котором все, кто умеет выгуливать по очереди выгуливают всех животных (мышь выгуливать
// не обязательно J)
//- метод allCatchMouse – в котором все, кто умеет ловить мышь по очереди ловят мышь.
//        - метод gettingOlder – в котором все одушевлённые стареют.

//По возможности все циклы писать через foreach.