package klassenarbeit3.zadacha;

public class Dog extends Animal{
    private String name;
    private String color;
    private int age;

    public Dog(String voice, String name, String color, int age) {
        super(voice);
        this.name = name;
        this.color = color;
        this.age = age;
    }

@Override
public void makeNoise() {
        System.out.println("dog laet " + getVoice());
    }
    @Override
    public void eat() {
        System.out.println("Dog est " + getFood());
    }
    @Override
    public void sleep() {
        System.out.println("Dog spit " + getLocation());
    }

    @Override
    public String getName() {
        return name;
    }

}
