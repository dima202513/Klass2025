package JurijPractika._15_04_2025;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    private boolean doAppend = true;
    private String path;

    public Logger(boolean doAppend, String path) {
        this.doAppend = doAppend;
        this.path = path;
    }

    public Logger(String path) {
        this.path = path;
    }

    public void info(String message, Class<?> clazz) {
        add(message, clazz, TrayIcon.MessageType.INFO);
    }

    public void error(String message, Class<?> clazz) {
        add(message, clazz, TrayIcon.MessageType.ERROR);
    }

    private void add(String message, Class<?> clazz, TrayIcon.MessageType messageType) {
        try (FileWriter fileWriter = new FileWriter(path, doAppend)) {
            BufferedWriter writer = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(LocalDateTime.now())
                    .append(" ")
                    .append(messageType)
                    .append(" : ")
                    .append(clazz.getName())
                    .append(" - ")
                    .append(message)
                    .append("\n");
            writer.write(stringBuilder.toString());
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//1. Создать класс Logger
//2. При инициализации нужно передать путь к файлу, куда будет записан лог
//3. Сделать методы:
//        - info - который принимает: текст сообщения, тип класса, в котором он вызван
//    - error - который принимает: текст сообщения, тип класса, в котором он вызван

//Формат сообщения:
//Время Тип сообщения : Имя класса - сообщение