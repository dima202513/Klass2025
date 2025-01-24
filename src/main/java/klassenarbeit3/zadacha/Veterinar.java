package klassenarbeit3.zadacha;

public class Veterinar {

    public void treatAnimal(Animal animal) {

        animal.eat();
        animal.sleep();
        animal.makeNoise();

        System.out.println("eda: " + animal.getFood());
        System.out.println("location " + animal.getLocation() );
        System.out.println("veterinar lechit zivotnoe: " + animal.getName());
    }
}
