package level17_map;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(10, "Алексей Ольгович");
        map.put(45, "Оксана Василисовна");
        map.put(9, "Нарцисса Лестренджевна");

        Collection<String> values = map.values();

        for (String v : values) {
            // map.put(4, "fdsf");
            System.out.println(v);
        }

        for (int i = 0; i < map.size(); i++) {
//            System.out.println(map.get(i));
//        }
            System.out.println(values.size());

//          Iterator<Map.Entry<Integer, String>> iterator =
            Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

            // НАБОР (Set) ВХОЖДЕНИЙ (Entry) -> Entry ЭТО ОБЕРТКА НАД ПАРОЙ КЛЮЧ-ЗНАЧЕНИЕ
            Set<Map.Entry<Integer, String>> entries = map.entrySet();

        }
    }
}
