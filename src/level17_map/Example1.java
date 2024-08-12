package level17_map;

import java.util.HashMap;
import java.util.Map;

public class Example1 extends Object {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Алексей Ольгович");
        map.put(45, "Оксана Василисовна");
        map.put(9, "Нарцисса Лестренджевна");
        System.out.println(map);
        System.out.println(map.size());

        map.put(999, "Нарцисса Лестренджевна");
        System.out.println(map);

        // ДОСТАЕМ Value(ЗНАЧЕНИЕ) по Key(КЛЮЧУ)
        System.out.println(map.get(9));

        // ПРОВЕРИТЬ СОДЕРЖИТ ЛИ МАПА КЛЮЧ?
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(60));

        // ПРОВЕРИТЬ СОДЕРЖИТ ЛИ МАПА ЗНАЧЕНИЕ?
        System.out.println(map.containsValue("Оксана Василисовна"));
        System.out.println(map.containsValue("Юрий Александрович"));

        // УДАЛИТЬ ИЗ МАПЫ СПОСОБ №1
        map.remove(999);
        System.out.println(map);

        // УДАЛИТЬ ИЗ МАПЫ СПОСОБ №1
        map.remove(1, "Алексей Ольгович");
        System.out.println(map);

        // ОЧИСТИМ
        map.clear();
        System.out.println(map);
        System.out.println(map.size());
    }
}
