package level06_arrays;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        //                    0      1       2       3         4        5
        String[] strings = {"One", "Two", "Three", "Five", "Eleven", "Twelve"};


        strings[0] = "Perpentum Mobile";
        System.out.println(strings[0]);

        if (strings[2].equals("Three")){
            strings[2] = "Samsung";
        }
        System.out.println(strings[2]);

        strings[5] = null;
        System.out.println(strings[5]);

        Scanner console = new Scanner(System.in);
        String s = console.nextLine();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(s)){
                System.out.println("Да, такое слово в массиве есть");
            }
        }

    }
}
