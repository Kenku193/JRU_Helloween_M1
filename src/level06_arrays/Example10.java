package level06_arrays;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {

        int[] massiv = {-1, 0, 100, 98, -8765, 555, 0, 1};

        // СОРТИРУЕМ МАССИВ
        Arrays.sort(massiv);

        // ВЫВОДИМ ОТСОРТИРОВАННЫЙ МАССИВ НА КОНСОЛЬ
        System.out.println(Arrays.toString(massiv));


    }
}
