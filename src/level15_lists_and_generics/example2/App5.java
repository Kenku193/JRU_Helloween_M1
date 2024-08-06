package level15_lists_and_generics.example2;

import java.util.ArrayList;

public class App5 {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>(100); // ВМЕСТИМОСТЬ НЕ РАВНА СОДЕРЖИМОМУ

        // ФАКТИЧЕСКОЕ КОЛИЧЕСТВО СОДЕРЖАЩИХСЯ ЭЛЕМЕНТОВ

        integerArrayList.add(99);
        integerArrayList.add(100);
        integerArrayList.add(101);
        integerArrayList.add(102);

        integerArrayList.remove(2);

        int size = integerArrayList.size();

        System.out.println(size);

    }
}
