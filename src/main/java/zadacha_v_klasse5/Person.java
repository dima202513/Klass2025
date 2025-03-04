package zadacha_v_klasse5;
import KlassLedenevRoman._2025_01_28.Cat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    public Person(String name, int age, List<Cat> cats) {
        this.name = name;

    }

    public Person(String name) {
        this.name = name;
    }

    public void grow(){
        age ++;
    }
    public void addCat(Cat cat){
        cats.add(cat);
    }
    private  String name;
    private int age = 18;
    private List<Cat> cats = new ArrayList<>(List.of(new Cat("Boston"), new Cat("Murka")));

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, cats);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cats=" + cats +
                '}';
    }

    public List<Cat> getCats() {
        return cats;
    }
}