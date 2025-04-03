package KlassRodin;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Дан список
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i<10; i++){
            list.add(random.nextInt(1, 100));
        }
        System.out.println(list);

       int maxNumber = list.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(maxNumber);
//
        int minNumber = list.stream().min(Integer::compareTo).orElseThrow();
        int sumMaxMin = minNumber + maxNumber;
        System.out.println(sumMaxMin);

        int doppeltNumber = list.stream().filter(n-> Collections.frequency(list, n)>1)
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println(doppeltNumber);
        Optional<String> optional = Optional.empty();
        String s = null;
        if(s == null){

        }
        optional.orElseThrow();
        optional.orElse("LaLa");
        optional.isPresent();
        optional.isEmpty();
        optional.ifPresent(System.out::println);
        optional.map(Double:: parseDouble).orElseThrow();
        optional.filter(n-> n.contains(".")).orElseThrow();


//        Set<Integer> temp = new HashSet<>();
//        int res3 = list.stream()
//                .filter(n-> !temp.add(n))
//                .max(Integer::compareTo)
//                .orElse(0);
//
    }
}

//Задача 1: Верните самое большое число списка с помощью стрима
//Задача 2: Верните сумму самого большого и самого маленького числа списка
//Задача 3: Верните самое большое продублированное число. Если дубликатов нет, то верните 0