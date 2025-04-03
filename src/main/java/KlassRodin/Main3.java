package KlassRodin;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<List<Integer>> measurements = java.util.List.of(
                java.util.List.of(-2, 5, 15),
                java.util.List.of(1, 20, -5),
                java.util.List.of(2, -30, 26),
                java.util.List.of(12, 22, -10),
                java.util.List.of(10, 27, -11),
                java.util.List.of(12, 25, -15)
        );

        List<Integer> allMeasurements = measurements.stream()
                .flatMap(List::stream)
                .toList();

        List<Integer> threeMin = allMeasurements.stream()
                .sorted()
                .limit(3)
                .toList();

        List<Integer> threeMax = allMeasurements.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println(threeMin);
        System.out.println(threeMax);

    }
}

// 1 уровень сложности: задание 1:
//У Вас есть список List> measurements, где каждый список - это измерения температуры за день. В день не более 10 измерений и температура колеблется от -30 до +30.
// Найдите 3 самых низких измерения и 3 самых высоких за все дни
//Задание 2:
//Список заменить на List>>, где Map<Номер дня, List<Значения температуры>>.
// Вернуть первые 3 дня, где средняя температура превышает 0 градусов
//
//2 уровень сложности: