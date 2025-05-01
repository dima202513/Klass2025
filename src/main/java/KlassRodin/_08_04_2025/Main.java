package KlassRodin._08_04_2025;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Пожалуйста, введите id:");
//        String id = scanner.nextLine();
//        System.out.println("Пожалуйста, введите login:");
//        String login = scanner.nextLine();
//        System.out.println("Пожалуйста, введите серию паспорта:");
//        int passportSeries = scanner.nextInt();
//        System.out.println("Пожалуйста, введите номер паспорта:");
//        int passportNumber = scanner.nextInt();
//        User user = new User(id, login, passportSeries, passportNumber);
//        OutputStream outputStream = new FileOutputStream(new File("C:/1/user"));
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        objectOutputStream.writeObject(user);
//        objectOutputStream.close();
        InputStream inputStream = new FileInputStream("C:/1/NeuerOrdner/countries");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        List<String> countries = (List<String>) objectInputStream.readObject();
        System.out.println(countries);
    }
}
