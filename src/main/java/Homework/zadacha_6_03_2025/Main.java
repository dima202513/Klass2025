package Homework.zadacha_6_03_2025;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String document = "[User]\n" + "Name: John Smith\n" + "Email: john.smith@example.com\n" + "Phone: +44-7911-123456\n" + "Age: 28\n\n" +
"[User]\n" + "Name: Emily Johnson\n" + "Email: emily.j@example.co.uk\n" + "Phone: +49-1521-9876543\n" +  "Age: 35\n\n" +
 "[User]\n" + "Name: William Brown\n" + "Email: william.brown@mail.net\n" + "Phone: +33-6-12-34-56-78\n" + "Age: 42\n\n" +
"[User]\n" + "Name: Mike_007\n" + "Email: mike007@website\n" +"Phone: +34-654-321\n" + "Age: 16\n\n" +
 "[User]\n" + "Name: Jessica Davis\n" + "Email: jessica.davis@example.org\n" + "Phone: +31-612345678\n" + "Age: 24\n\n" +
"[User]\n" + "Name: Thomas Anderson\n" +"Email: thomas@matrix.com\n" + "Phone: +41-78-987-65-43\n" + "Age: 35\n";
//        String document = “””
//[User]
//        Name: John Smith
//        Email: john.smith@example.com
//        Phone: +44-7911-123456
//        Age: 28
//
//                [User]
//        Name: Emily Johnson
//        Email: emily.j@example.co.uk
//        Phone: +49-1521-9876543
//        Age: 35
//
//                [User]
//        Name: William Brown
//        Email: william.brown@mail.net
//        Phone: +33-6-12-34-56-78
//        Age: 42
//
//                [User]
//        Name: Mike_007
//        Email: mike007@website
//        Phone: +34-654-321
//        Age: 16
//
//                [User]
//        Name: Jessica Davis
//        Email: jessica.davis@example.org
//        Phone: +31-612345678
//        Age: 24
//
//                [User]
//        Name: Thomas Anderson
//        Email: thomas@matrix.com
//        Phone: +41-78-987-65-43
//        Age: 35
//“””;

        List<User> users = UserParser.parseUsers(document);
        users.forEach(System.out::println);
    }
}
