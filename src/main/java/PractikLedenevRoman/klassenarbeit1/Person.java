package PractikLedenevRoman.klassenarbeit1;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public void move() {
        System.out.println(" Person " + fullName + " idet ");
    }

    public void talk() {
        System.out.println("Person " + fullName + " vozrast " + age + " govorit ");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(15, " vasya petrov ");

    person1.move();
    person2.talk();
    person1.move();
    person2.talk();
        System.out.println(person1.getFullName());
    }
    public String getFullName() {
        return " Person " + fullName + " idet ";

    }
}


//Создать класс Person, который содержит:
//a) поля fullName, age.
//б) методы move() и talk(), в которых просто вывести на консоль сообщение –“Person <имя> идёт.”, "Person <имя> <возраст> говорит".
//в) Добавьте два конструктора  - Person() и Person(fullName, age).
//Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).