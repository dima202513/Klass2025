package klassenarbeit3.zadacha;

public class Horse extends Animal{
    private String name;
    private String color;
    private int age;

    public Horse(String voice, String name, String color, int age) {
        super(voice);
        this.name = name;
        this.color = color;
        this.age = age;
    }


@Override
    public void makeNoise() {
        System.out.println("rzet " + getVoice());
    }

    @Override
    public void eat() {
        System.out.println("kon est " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("kon spit " + getLocation());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getName() {
        return name;
    }
}
