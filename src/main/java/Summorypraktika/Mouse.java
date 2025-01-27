package Summorypraktika;

public class Mouse extends Animal{
    public Mouse(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("pee-pee- I am a mouse. My name is " + getName());
    }

}
