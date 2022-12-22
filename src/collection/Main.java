package collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final Map<String, Integer> strMap = new HashMap<>();
    public static void main(String[] args) {
    }

    private static void collection() {
        addNumerToMap("Строка1", 1);
        addNumerToMap("Страка2", 2);
        addNumerToMap("Строка", 3);
        addNumerToMap("Строка2", 4);
    }
    private static void addNumerToMap(String s, Integer i) {
        if (strMap.containsKey(s) && strMap.containsValue(i)) {
            throw new RuntimeException(strMap + "Ключ уже есть и значение совпадают.");
        }
        strMap.put(s, i);

        for (Map.Entry<String, Integer> stringIntegerEntry : strMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+ " : " + stringIntegerEntry.getValue());
        }
    }

    public static Integer sumElements(List<Integer> list) {
        Integer sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }
}
