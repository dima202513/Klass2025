package JurijPractika._20_03_2025;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Kostya", 23);
        Student student2 = new Student("Vova", 29);

        System.out.println(student1);
        System.out.println(student2);

        KonverterImpl konverter = new KonverterImpl();
        String studentName = konverter.konvert(student1);

        System.out.println(studentName);


    Konverter konverter1 = new Konverter() {
        @Override
        public String konvert(Student student) {
            return student.getName();
        }
    };
    String result = konverter1.konvert(student2);
   System.out.println(result);

   Konverter konverter2 = (Student student) -> student.getName();
       String result2 = konverter2.konvert(student1);
        System.out.println(result2);
}
}
