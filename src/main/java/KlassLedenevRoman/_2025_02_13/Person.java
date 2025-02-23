package KlassLedenevRoman._2025_02_13;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String firstName;
    private String lastName;
    private int age;

    public Person(String name, String firstName, String lastName, int age) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }


    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
