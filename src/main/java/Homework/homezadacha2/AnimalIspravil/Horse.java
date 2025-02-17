package Homework.homezadacha2.AnimalIspravil;

public class Horse extends Animal{
    private String name;
    private String color;
    private int age;
    private String voice;

    public Horse(String name, String color, int age, String voice) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.voice = voice;
    }

    public String getName() {
        return name;
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

    @Override
    public void makeNoise() {
        System.out.println("horse  " + getName() + " make " + getVoice());
//        System.out.println("character animal: " + getName() + " color "+ getColor() + " age "+ getAge() +" rzet" + " "+ getVoice());
    }

    @Override
    public void eat() {
        System.out.println("horse eat " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("horse sleep in " + getLocation());
    }

}
