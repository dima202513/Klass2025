package homezadacha2.AnimalIspravil;

public class Veterinar {

    public void treatAnimal(Animal animal) {

        animal.eat();
        animal.sleep();
        animal.makeNoise();

        System.out.println("veterinar offers food: " + animal.getFood());
        System.out.println("veterinar offers location " + animal.getLocation() );
//        System.out.println("veterinar lechit zivotnoe: " + animal.getName());
    }
}
