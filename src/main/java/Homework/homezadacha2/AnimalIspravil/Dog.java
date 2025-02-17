package Homework.homezadacha2.AnimalIspravil;

public class Dog extends Animal{
    private String name;
    private String color;
    private int age;
    private String voice;

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


    public Dog(String name, String color, int age, String voice) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.voice = voice;
    }


@Override
public void makeNoise() {
        System.out.println("dog  " + getName() + " barks " + getVoice());
    }
    @Override
    public void eat() {
        System.out.println("Dog eat " + getFood());
    }
    @Override
    public void sleep() {
        System.out.println("Dog sleep " + getLocation());
    }



}
