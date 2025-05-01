package KlassRodin._08_04_2025;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.*;

import static KlassRodin._08_04_2025.User.generateUsers;
import static KlassRodin._08_04_2025.User.splitUsersBySeries;

public class NewMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Random random = new Random();
        OutputStream fileOutput = new FileOutputStream("C:/1/users_raw");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutput);
        List<User> users = new ArrayList<>();
        for(int i =0; i <100; i++){
            users.add(new User("id_"+ UUID.randomUUID(), "login_"+UUID.randomUUID(), random.nextInt(1000, 9999), random.nextInt(1000, 9999)));
        }
        objectOutputStream.writeObject(users);

        generateUsers();
        splitUsersBySeries();
        Map<String, List<User>> rangeMap = new HashMap<>();
        for (User user : users) {
            int series = user.getPassportSeries();
            int lowerBound = (series / 1000) * 1000;
            int upperBound = lowerBound + 999;
            String fileName = "users" + lowerBound + "-" + upperBound;

            rangeMap.computeIfAbsent(fileName, k -> new ArrayList<>()).add(user);
        }

        for (Map.Entry<String, List<User>> entry : rangeMap.entrySet()) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/1/NeuerOrdner/" + entry.getKey()))) {
                out.writeObject(entry.getValue());
            }
        }
    }
}
