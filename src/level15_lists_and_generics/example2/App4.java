package level15_lists_and_generics.example2;

import java.util.ArrayList;
import java.util.Map;

public class App4 {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Привет!");
        String s1 = "Я Юра";
        String s2 = new String("Я Юра");
        stringArrayList.add(s1);
        stringArrayList.add(s2);
        stringArrayList.add(new String("Я программист!"));

        System.out.println(stringArrayList);

        stringArrayList.remove("Я Юра"); // НОВЫЙ И СРАВНИВАЕТ - НО НЕ ЗАБЫВАЕМ ПРО СТРИНГ ПУЛ
        System.out.println(stringArrayList);

        stringArrayList.remove(1);
        System.out.println(stringArrayList);

//      String s = stringArrayList.get(1);
//      System.out.println(s);
        System.out.println(stringArrayList.get(1));



    }
}
