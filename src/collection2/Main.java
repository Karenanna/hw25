package collection2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> listMap = new HashMap<>();
        listMap.put("строка1", List.of(11, 12, 13));
        listMap.put("строка2", List.of(100, 120, 130));
        listMap.put("строка3", List.of(210, 125, 138));
        listMap.put("строка4", List.of(119, 184, 136));
        listMap.put("строка5", List.of(399, 522, 999));

        Map<String, List<Integer>> listMap1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringListEntry : listMap1.entrySet()) {
            listMap1.put(stringListEntry.getKey();
        }
            for (Map.Entry<String, Integer> stringIntegerEntry : listMap1.entrySet()) {
                System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
    }
}