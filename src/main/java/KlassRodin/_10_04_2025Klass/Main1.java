package KlassRodin._10_04_2025Klass;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:/1/NeuerOrdner/descr_climates.txt");
        List<String> climatesList = new ArrayList<>();
        List<String> hotClimatesList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            String currentClimate = null;
            int currentHeat = 0;

            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("climate")) {
                    String[] parts = line.split(" ");
                    if (parts.length >= 2) {
                        currentClimate = parts[1];
                        climatesList.add(currentClimate);
                    } else {
                        System.out.println(" Ошибка: строка 'climate' без названия — " + line);
                        currentClimate = null;
                    }
                } else if (line.startsWith("heat") && currentClimate != null) { // ← этот else if сразу после предыдущего if
                    String[] parts = line.split(" ");
                    if (parts.length >= 2) {
                        try {
                            currentHeat = Integer.parseInt(parts[1]);
                            if (currentHeat > 3) {
                                hotClimatesList.add(currentClimate);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Неверное значение heat: " + line);
                        }
                    } else {
                        System.out.println("Строка heat без значения: " + line);
                    }
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/1/climates_list.txt"))) {
                    for (String climate : climatesList) {
                        writer.write(climate);
                        writer.newLine();
                    }
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/1/hot_climates.txt"))) {
                    for (String climate : hotClimatesList) {
                        writer.write(climate);
                        writer.newLine();
                    }
                }
            }
        }}}
//StringBuilder input = new StringBuilder();
//try (FileReader fileReader = new FileReader("files/descr_climates.txt")) {
//BufferedReader bufferedReader = new BufferedReader(fileReader);
//String line;
//    while ((line = bufferedReader.readLine()) != null) {
//        input.append(line).append("\n");
//    }
//            } catch (IOException e) {
//        throw new RuntimeException(e);
//}

// Задача 1: Прочитайте файл descr_climates.txt и извлеките из него список климатов,
// и запишите его в отдельный файл climates_list.txt
//String inputString = input.toString();
//int indexClimates = inputString.indexOf("climates");
//int indexStart = inputString.indexOf('{', indexClimates) + 1;
//int indexEnd = inputString.indexOf('}', indexStart);
//String[] climates = inputString.substring(indexStart, indexEnd).trim().split("\n\t");
//.replace("\t","")
//
//Rodin Stepan 12:11
////Создаем поток ввода символов
//FileReader fileReader = new FileReader("C:/1/descr_climates.txt");
//try(fileReader) {
////Создаем объект для чтения потока
//BufferedReader bufferedReader = new BufferedReader(fileReader);
////Вкладываем строку во временную переменную
//String tmp = bufferedReader.readLine();
////Объявляем StringBuilder для последовательного добавления строк
//StringBuilder sb = new StringBuilder();
////Читаем файл в цикле, пока не наткнемся на начало списка климатов
//    while (!tmp.equals("{")){
//tmp = bufferedReader.readLine();
//    }
//            //Читаем список климатов и вкладываем каждую строчку в StringBuilder
//            while (!tmp.equals("}")){
//tmp = bufferedReader.readLine();
//            sb.append(tmp);
//            sb.append("\n");
//    }
//
////Объявляем поток вывода символов
//FileWriter fileWriter = new FileWriter("C:/1/climates_list.txt");
////Записываем получившуюся в StringBuilder строку в файл
//    try (fileWriter){
//BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write(sb.toString().replace("\t", "").replace("}", ""));
//        bufferedWriter.flush();
//    }
//            }
//List<String> hotClimates = new ArrayList<>();
////Создаем поток ввода символов
//try(FileReader fileReader = new FileReader("C:/1/descr_climates.txt")) {
////Создаем объект для чтения потока
//BufferedReader bufferedReader = new BufferedReader(fileReader);
////Вкладываем строку во временную переменную
////Перебираем строки документа, пока не закончатся
//String tmp = "";
//    while (tmp != null){
//tmp = bufferedReader.readLine();
//        if(tmp==null){
//        break;
//        }
        //Если наткнулись на строчку с климатом - сохраняем название климата
//        if(tmp.contains("climate ")){
//String climate = tmp.replace("climate ", "");
////перебираем, пока не найдем температуру
//            while (!tmp.contains("heat")){
//tmp = bufferedReader.readLine();
//            }
//tmp = tmp.replace("heat\t", "");
////Парсим число из символа и добавляем климат в список, если число больше 3
//            if(Integer.parseInt(tmp.trim())>2){
//        hotClimates.add(climate);
//            }
//                    }
//                    }
//                    }
//                    try(FileWriter fileWriter = new FileWriter("C:/1/hot_climates.txt")) {
//BufferedWriter writer = new BufferedWriter(fileWriter);
//    for(String s: hotClimates){
//        writer.write(s);
//        writer.write("\n");
//    }
//            writer.flush();

//Задача 1: Прочитайте файл descr_climates.txt и извлеките из него список климатов,
// и запишите его в отдельный файл climates_list.txt
//Задача 2: Прочитайте файл descr_climates.txt и извлеките из него список климатов с heat больше 3.
// Поместите получившиеся климаты в отдельный файл hot_climates.txt