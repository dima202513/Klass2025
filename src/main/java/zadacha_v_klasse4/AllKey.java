package zadacha_v_klasse4;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllKey {
    public static void main(String[] args) {
Map<String, Integer> map = Map.of("hi", 5, "zuu", 3, "fff" , 3);
        System.out.println(findKeys(map,3));
    }
    public static List<String> findKeys(Map<String, Integer> map, Integer target){
        List<String> result = new ArrayList<>();
       Set<Map.Entry<String, Integer>> set = map.entrySet();
       for (Map.Entry<String, Integer> entry : set){
           if (entry.getValue().equals(target)){
               result.add(entry.getKey());
           }
        }
        return result;
    }
}
//Найти все ключи в Map<String, Integer>, соответствующие
//        заданному значению, и вернуть их в виде списка.