package _2025_02_13klass;

public class Person implements Comparable<Person> {
    private String name;

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}