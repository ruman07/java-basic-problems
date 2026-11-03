package problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValue {
    public static void main(String[] args) {

        Map<String, Integer> data = new HashMap<>();
        data.put("A", 20);
        data.put("B", 10);
        data.put("C", 50);
        data.put("F", 70);
        data.put("Q", 90);

//    LinkedHashMap<String,Integer> sortedMap = data.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
//    sortedMap.forEach((k,v)-> System.out.println(k+"->"+v));

        LinkedHashMap<String,Integer> sortedDec = data.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String,Integer>::getValue).reversed()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(d1,d2)->d1,LinkedHashMap::new));
        sortedDec.forEach((k,v)-> System.out.println(k+"->"+v));
    }
}
