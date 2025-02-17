package KlassLedenevRoman._2025_01_24;

public abstract class Creature {
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    public void play(Creature another) {
        System.out.println(this.name + "plaing with " + another.name);
    }

    public String getName() {
        return name;
    }
}


