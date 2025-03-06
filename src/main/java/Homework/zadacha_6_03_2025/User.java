package Homework.zadacha_6_03_2025;

class User {
    String firstName;
    String lastName;
    String email;
    String phone;
    int age;
    public User(String firstName, String lastName, String email, String phone, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Email: " + email + ", Phone: " + phone + ", Age: " + age + ")";
    }
}
