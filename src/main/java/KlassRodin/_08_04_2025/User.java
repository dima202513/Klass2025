package KlassRodin._08_04_2025;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor

public class User implements Serializable {
    private final static long serialVersionUID = 1L;
    private String id;
    private String login;
    private int passportSeries;
    private int passportNumber;


    public static void generateUsers() throws IOException {
        Random random = new Random();
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/1/users_raw"))) {
            List<User> users = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                users.add(new User(
                        "id_" + UUID.randomUUID(),
                        "login_" + UUID.randomUUID(),
                        random.nextInt(1000, 10000),
                        random.nextInt(1000, 10000)
                ));
            }
            out.writeObject(users);
        }
    }

    public static void splitUsersBySeries() throws IOException, ClassNotFoundException {
        List<User> users;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/1/users_raw"))) {
            users = (List<User>) in.readObject();
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", passportSeries=" + passportSeries +
                ", passportNumber=" + passportNumber +
                '}';
    }
}
