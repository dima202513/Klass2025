package KlassLedenevRoman._2025_01_24;

public class HouseApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Boston", 7, "cocker spaniel");
        Dog dog2 = new Dog("Bulldog", 5, "bulldog");
        Dog dog3 = new Dog("Simkai", 5, "pudelian");
        Cat cat1 = new Cat("Sonya", 7, "ginger");
        Cat cat2 = new Cat("Luna", 6, "black");
        Mouse mouse = new Mouse("Stuart little", 3);
        Human human = new Human("Richard", 40);
        Robot robot = new Robot("R202");
        Creature[] creatures = {cat1, dog1, robot, human, mouse};
        AnimalWalker[] AnimalWalkers = {human, robot};
        Animal[] houseAnimals = {cat1, cat2, dog1, dog2, dog3};
        MouseCatcher[] mouseCatchers = {cat1, robot};
        Animated[] animateds = {cat1, cat2, dog1, dog2, dog3, human, mouse};


        human.feed(cat1, dog1, mouse);
        human.feed(houseAnimals);
        human.feed(dog1);
        System.out.println("--------------------------------");

        gretings(creatures);
        System.out.println("--------------------------------");

        playEachOther(creatures);
        System.out.println("--------------------------------");

        walkAnimals(AnimalWalkers, houseAnimals);
        System.out.println("--------------------------------");

        allCatchMouse(mouseCatchers, mouse);
        System.out.println("--------------------------------");

        gettingOlder(animateds);
        System.out.println("--------------------------------");
    }

    public static void gretings(Creature[] creatures) {
        for (Creature creature : creatures) {
            creature.sayHello();
        }
    }

    public static void playEachOther(Creature[] creatures) {
//        for (Creature creature : creatures) {
//            for (Creature creature1 : creatures) {
//                if (creature1 != creature2) {
//                    creature1.play(creature2);
        for (int i = 0; i < creatures.length; i++) {
            for (int j = i + 1; j < creatures.length; j++) {
                creatures[i].play(creatures[j]);
            }
        }
    }

    public static void walkAnimals(AnimalWalker[] animalWalkers, Animal[] animals) {
        int walkerIndex = 0;
        for (Animal animal : animals) {
            if (walkerIndex == animalWalkers.length) {
                walkerIndex = 0;
            }
            animalWalkers[walkerIndex++].walkAnimal(animal);
        }
    }
    public static void allCatchMouse(MouseCatcher[] mouseCatchers, Mouse mouse) {
        for (MouseCatcher mouseCatcher : mouseCatchers) {
            mouseCatcher.catchMouse(mouse);
        }
    }
    public static void gettingOlder(Animated[] animateds) {
        for (Animated animated : animateds) {
            animated.grow();
        }
    }
}



