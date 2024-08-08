package level16_set.example2;

import java.util.*;

public class App1 {
    public static void main(String[] args) {

        HashSet<String> strings = new HashSet<>();

        strings.add("Привет!");
        strings.add("Я");
        strings.add("Юра");

        System.out.println(strings.size());

        boolean add1 = strings.add("Привет!");
        System.out.println(add1);
        boolean add2 = strings.add("Привет!");
        System.out.println(add2);

        boolean add3 = strings.add("Я разработчик");
        System.out.println(add3);

        System.out.println(strings.size());

        strings.remove("Дима");
        System.out.println(strings.size());

        strings.clear();
        System.out.println(strings.size());

    }
}
