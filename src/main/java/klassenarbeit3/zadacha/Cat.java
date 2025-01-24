package klassenarbeit3.zadacha;

public class Cat extends Animal{
    private String name;
    private String color;
    private int age;

    public Cat(String voice, String name, String color, int age) {
        super(voice);
        this.name = name;
        this.color = color;
        this.age = age;
    }

   @Override
    public void makeNoise() {
        System.out.println("kot myaukaet " + getVoice());
    }
    @Override
    public void eat() {
        System.out.println("kot est " + getFood());
    }
    @Override
    public void sleep() {
        System.out.println("kot spit " + getLocation());
    }


    @Override
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
