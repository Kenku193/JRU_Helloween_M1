package level17_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Алексей Ольгович");
        map.put(45, "Оксана Василисовна");
        map.put(9, "Нарцисса Лестренджевна");

        // ПРИМЕР 1
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key);
        }

        // ПРИМЕР 2 - БЕЗ ВЫДЕЛЕНИЯ ПЕРЕМЕННОЙ keySet
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }



    }
}
