package Summory_Rodin._11_04_2025;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main1Home {
    public static void main(String[] args) {
        String inputFilePath = "C:/1/NeuerOrdner/export_descr_guilds.txt";
                // Папка, куда будут сохраняться файлы
                String outputFolderPath = "C:/1/guilds/";
                new File(outputFolderPath).mkdirs(); // Создаём папку, если её нет

                Map<String, String> guildMap = new LinkedHashMap<>();

                try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
                    String line;
                    String guildKey = null; // временное хранение ключа

                    while ((line = reader.readLine()) != null) {
                        line = line.trim();

                        // Пропускаем комментарии и пустые строки
                        if (line.isEmpty() || line.startsWith(";")) {
                            continue;
                        }

                        // Если строка начинается с Guild — сохраняем ключ
                        if (line.startsWith("Guild ")) {
                            String[] parts = line.split("\\s+");
                            if (parts.length > 1) {
                                guildKey = parts[1]; // например, masons_guild
                            }
                        }

                        // Если строка начинается с building и ключ уже найден — это значение
                        else if (line.startsWith("building") && guildKey != null) {
                            String[] parts = line.split("\\s+");
                            if (parts.length > 1) {
                                String guildValue = parts[1]; // например, guild_masons_guild
                                guildMap.put(guildKey, guildValue); // сохраняем пару
                                guildKey = null; // сбрасываем, ждём следующую гильдию
                            }
                        }
                    }

                    // Запись в отдельные файлы
                    for (Map.Entry<String, String> entry : guildMap.entrySet()) {
                        String fileName = outputFolderPath + entry.getKey() + ".txt";
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                            writer.write(entry.getValue());
                        }
                    }

                    System.out.println("Все пары Guild → building успешно сохранены в файлы.");

                } catch (IOException e) {
                    System.out.println("Ошибка при обработке файла: " + e.getMessage());
                }
            }
        }
/*
Задача 1: Прочитайте файл export_descr_guilds.txt и
извлеките из него все пары значений Guild и building.
Поместите эти пары в Map, а затем запишите получившиеся пары в
файлы так, чтобы ключ был именем файла, а значение - содержимым
 */