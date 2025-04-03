package KlassRodin;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<List<Integer>> measurements = List.of(
                List.of(-10, 5, 15),
                List.of(3, 20, -5),
                List.of(0, -30, 25),
                List.of(12, 28, -10),
                List.of(10, 27, -11),
                List.of(12, 25, -15)
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
//У Вас есть список List<List<Integer>> measurements, где каждый список -
// это измерения температуры за день. В день не более 10 измерений и
// температура колеблется от -30 до +30. Найдите 3 самых низких измерения
// и 3 самых высоких за все дни