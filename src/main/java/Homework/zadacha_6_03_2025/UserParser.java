//package Homework.zadacha_6_03_2025;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//class UserParser {
//    private static final Pattern usersPattern = Pattern.compile(
//            "Name: ([A-Za-z]+) ([A-Za-z]+)\\n" + "Email: ([A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,})\\n" + "Phone: (\\+\\d{1,3}-[\\d-]+)\\n" + "Age: (\\d+)\\n", Pattern.MULTILINE
//    );
//
//    public static List<User> parseUsers(String document) {
//        List<User> users = new ArrayList<>();
//        Matcher matcher = usersPattern.matcher(document);
//
//        while (matcher.find()) {
//            String firstName = matcher.group(1);
//            String lastName = matcher.group(2);
//            String email = matcher.group(3);
//            String phone = matcher.group(4);
//            int age = Integer.parseInt(matcher.group(5));
//
//            users.add(new User(firstName, lastName, email, phone, age));
//        }
//        return users;
//    }
//}
//
