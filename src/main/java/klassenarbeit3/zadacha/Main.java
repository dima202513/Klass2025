package klassenarbeit3.zadacha;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("wow", "bars", "gelb", 3),
                new Cat("myau", "masik", "blau", 7),
                new Horse("igogo", "luna", "black", 6),
        };
        animals[0].setFood("kost");
        animals[1].setFood("korm");
        animals[2].setFood("seno");
        animals[0].setLocation("dom");
        animals[1].setLocation("kitchen");
        animals[2].setLocation("stojlo");

        Veterinar veterinar = new Veterinar();
        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
        }
        }
    }