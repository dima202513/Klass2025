package Homework.zadacha_6_03_2025;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserParser {
    private static final Pattern namePattern = Pattern.compile("Name: ([A-Za-z'-]+) ([A-Za-z'-]+)");
    private static final Pattern emailPattern = Pattern.compile("Email: ([A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,})");
    private static final Pattern phonePattern = Pattern.compile("Phone: (\\+\\d{1,3}[-\\s]?(\\(\\d+\\)|\\d+)[-\\s]?\\d+[-\\s]?\\d+)");
    private static final Pattern agePattern = Pattern.compile("Age: (\\d+)");

    public static List<User> parseUsers(String document) {
        List<User> users = new ArrayList<>();

        String[] userBlocks = document.split("\\n\\n");

        for (String userBlock : userBlocks) {
            Matcher nameMatcher = namePattern.matcher(userBlock);
            Matcher emailMatcher = emailPattern.matcher(userBlock);
            Matcher phoneMatcher = phonePattern.matcher(userBlock);
            Matcher ageMatcher = agePattern.matcher(userBlock);

            if (nameMatcher.find() && emailMatcher.find() && phoneMatcher.find() && ageMatcher.find()) {
                try {
                    String firstName = nameMatcher.group(1);
                    String lastName = nameMatcher.group(2);
                    String email = emailMatcher.group(1);
                    String phone = phoneMatcher.group(1);
                    int age = Integer.parseInt(ageMatcher.group(1));

                    users.add(new User(firstName, lastName, email, phone, age));
                } catch (NumberFormatException e) {
                    System.err.println("\"Error. Invalid age format\n" + userBlock);
                }
            } else {
                System.err.println("Error. Missing required user data\n" + userBlock);
            }
        }
        return users;
    }
}