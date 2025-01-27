package Summorypraktika;

public abstract class Animal extends Animated{
    private boolean isHangry = true;

    public Animal(String name, int age) {
        super(name, age);
        this.isHangry = isHangry;
    }

    public void setHangry(boolean hangry) {
        isHangry = hangry;
    }

    public void eat() {
        if (isHangry) {
            System.out.println(getName() + " is eating");
            isHangry = false;
        } else {
            System.out.println(getName() + " doesn´t want to eat");
        }

}

    public void setHungry(boolean b) {

    }
}
