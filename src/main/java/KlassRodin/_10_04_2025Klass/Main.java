package KlassRodin._10_04_2025Klass;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        //Записываем тестовые данные байтовым потоком вывода
        FileOutputStream outputStream = new FileOutputStream("C:/1/somefile");
        String stringToWrite = "1; login12312; nameLalala";
        try (outputStream) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            bufferedOutputStream.write(stringToWrite.getBytes());
            bufferedOutputStream.flush();
        }

//Записываем тестовые данные символьным потоком вывода
        FileWriter writer = new FileWriter("C:/1/somefile1");
        try (writer) {
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(stringToWrite);
            bufferedWriter.flush();
        }
//Использование байтового потока
        FileInputStream inputStream = new FileInputStream("C:/1/somefile");
        try (inputStream) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        }

//Использование символьного потока
        FileReader fileReader = new FileReader("C:/1/somefile");
        try (fileReader) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        }

        //Использование байтового потока
        FileInputStream inputStream1 = new FileInputStream("C:/1/somefile");
        try (inputStream1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream1);
            byte[] arr = new byte[bufferedInputStream.available()];
            while (bufferedInputStream.read(arr) != -1) {
                System.out.println("Я записываю данные в виде байт");
            }
            String s = new String(arr);
            System.out.println("Результат записи: " + s);
        }

        //Использование символьного потока
        FileReader fileReader1 = new FileReader("C:/1/somefile");
        try (fileReader1) {
            BufferedReader bufferedReader = new BufferedReader(fileReader1);
            StringBuilder sb = new StringBuilder();
            while (bufferedReader.read() != -1) {
                sb.append(bufferedReader.readLine());
                System.out.println("Я записываю данные в виде символов");
            }
            System.out.println("Результат записи: " + sb);
        }
    }
}