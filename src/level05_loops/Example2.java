package level05_loops;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите кол-во шагов цикла (итераций):");
        int i = console.nextInt();

        for (int x = 0; x < i; x++) {
            System.out.println("Hello " + x);
        }


    }
}
