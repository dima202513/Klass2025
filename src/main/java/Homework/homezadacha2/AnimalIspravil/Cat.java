package Homework.homezadacha2.AnimalIspravil;

public class Cat extends Animal{
    private String name;
    private String color;
    private int age;
    private String voice;

    public Cat(String name, String color, int age, String voice) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.voice = voice;
    }
    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getVoice() {
        return voice;
    }

    public String getName() {
        return name;
    }


   @Override
    public void makeNoise() {
        System.out.println("cat " + getName() + " make " + getVoice());
    }
    @Override
    public void eat() {
        System.out.println("cat eat " + getFood());
    }
    @Override
    public void sleep() {
        System.out.println("cat sleep " + getLocation());
    }


}
