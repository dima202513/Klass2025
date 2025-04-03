package KlassRodin;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<List<Person>> enterprise = List.of(
                List.of(new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000)), new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000)), new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000))),
                List.of(new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000)), new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000)), new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000))),
                List.of(new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000)), new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000)), new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000))),
                List.of(new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000)), new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000)), new Person(UUID.randomUUID().toString(), random.nextInt(1, 2000)))
        );
//Каждый вложенный список - отдельная компания в рамках холдинга.
// Верните имя сотрудника с самой высокой заплатой среди всех компаний
        String name = enterprise.stream()
                .flatMap(List::stream)
                .max((p1, p2) -> Math.max(p1.getSalary(), p2.getSalary()))
                .orElseThrow().getName();
    }}



//na dom
//Список заменить на List<Map<Integer, List<Integer>>>,
// где Map<Номер дня, List<Значения температуры>>. Вернуть первые 3 дня,
// где средняя температура превышает 0 градусов
