package ckassarbeite1;

public class Student {
    private String name;
    private int age;
    private int rate;


    public void setAge(int age) {
        if ((age >= 18) && (age <= 55)) {
            this.age = 25;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                '}';
    }
}
