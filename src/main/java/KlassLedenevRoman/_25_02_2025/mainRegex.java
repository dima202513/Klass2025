package KlassLedenevRoman._25_02_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainRegex {
    public static void mainRegex(String[] args) {
        String string = " \"Он решил оплатить картой Mastercard с номером 1234-5678-9012-3456. В тот же день он отправил email другу на адрес ivan_ivanov@example.com, а также зашёл на сайт https://shop.example.ru.\\n\" +";
        System.out.println(getNumbers(string));
    }



    //Дан текст в котором есть слова и числа, вывести все числа в виде массива
    public static List<Double> getNumbers(String text){
        Pattern pattern = Pattern.compile("\\d+\\.?\\d*");
        Matcher matcher = pattern.matcher(text);
        List<Double> result = new ArrayList<>();
        while (matcher.find()){
            result.add(Double.parseDouble(matcher.group()));
        }
        return result;
    }



}

//Иван Иванович купил 3 яблока по цене 25.50 рубля за штуку. В магазине также были груши (4 штуки), но они стоили 30.75 рубля.\n" +
//        "Он решил оплатить картой Mastercard с номером 1234-5678-9012-3456. В тот же день он отправил email другу на адрес ivan_ivanov@example.com, а также зашёл на сайт https://shop.example.ru.\n" +
//        "Вечером в 19:45 он позвонил по номеру +7 (495) 123-45-67, чтобы заказать доставку.
//        "Иван Иванович купил 3 яблока по цене 25.50 рубля за штуку. В магазине также были груши (4 штуки), но они стоили 30.75 рубля.\n" +
//        "Он решил оплатить картой Mastercard с номером 1234-5678-9012-3456. В тот же день он отправил email другу на адрес ivan_ivanov@example.com, а также зашёл на сайт https://shop.example.ru.\n" +
//        "Вечером в 19:45 он позвонил по номеру +7 (495) 123-45-67, чтобы заказать доставку."

//teacher03 starta.university 10:07
//https://regex101.com/
//
//teacher03 starta.university 11:10
//перерыв 11-23
//
//Liudmyla Iermolenko 11:35
//        \d{2}:\d{2}:\d{2}
//
//teacher03 starta.university 11:38
//Pattern pattern = Pattern.compile("\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}");
//
//teacher03 starta.university 12:31
//Дан текст в котором есть слова и числа, вывести все числа в виде массива
//An den "Meeting-Gruppenchat" gerichtete Nachrichten werden auch im Meeting-Gruppenchat in Team-Chat angezeigt