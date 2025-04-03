package JurijPractika._27_03_2025Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "Piter", 20);
        Student student2 = new Student(2, "Michail", 19);
        Student student3 = new Student(3, "Michail", 24);
        Student student4 = new Student(4, "Sasha", 23);
        Student student5 = new Student(5, "Igor", 21);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("List ID of students: " + convertList(students));

        System.out.println("List Age of students: " + filterList(students));

        System.out.println("List Id and names of students: " + sortedList(students));

    }

    public static List<Integer> convertList(List<Student> students) {
        List<Integer> studentsId = students.stream().map(s -> s.getId()).collect(Collectors.toList());
        return studentsId;
    }

    public static List<Student> filterList(List<Student> students) {
        List<Student> studentsAge = students.stream().filter(s -> s.getAge() > 23).collect(Collectors.toList());
        return studentsAge;
    }

    public static List<Integer> sortedList(List<Student> students) {
        List<Integer> studentsNamesAndID = students.stream()
                .filter(s -> s.getName().startsWith("M"))
                .map(s -> s.getId())
                .sorted(((a, b) -> Integer.compare(b, a)))
                .collect(Collectors.toList());
        return studentsNamesAndID;
    }

}


/**
 * Создать список из 10 студентов
 * Студент должен содержать id, name, age
 * <p>
 * С помощью stream api :
 * 1) Взять список студентов и вернуть список их id
 * 2) Взять список студентов и вернуть список студентов,
 * возраст которых больше 25
 * 3) Взять список студентов и вернуть список id студентов
 * отсортированным по убыванию и только для тех чье имя
 * начинается с "M"
 */