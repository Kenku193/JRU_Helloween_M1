package level06_arrays;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        int[] massiv = {1, 90, -1, 8, 55};

        Scanner console = new Scanner(System.in);
        System.out.println("ВВЕДИТЕ ЧИСЛО ДЛЯ ПОИСКА:");
        String s = console.nextLine();
        int i = Integer.parseInt(s);

        for (int o = 0; o < massiv.length; o++) {
            if (i == massiv[o]){
                System.out.println("Число найдено. Индекс элемента " + o);
            }
        }

    }
}
