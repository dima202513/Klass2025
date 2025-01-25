package homezadacha2.AnimalIspravil;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("bars" ,"gelb",5,"wow" ),
                new Cat("masik","blau" ,7,"myau" ),
                new Horse("luna","black" ,9,"igogo" ),

        };
        System.out.println("Come to veterinar");
        animals[0].setFood("bones");
        animals[1].setFood("whiskas");
        animals[2].setFood("hay");
        animals[0].setLocation("house");
        animals[1].setLocation("kitchen");
        animals[2].setLocation("stall");

        Veterinar veterinar = new Veterinar();
        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
            System.out.println();
        }
        }
    }