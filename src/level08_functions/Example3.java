package level08_functions;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
    public static int[] counts = new int[5];

    public static void main(String[] args) {

        fill(5, 4, 5,3, 2);
        printOut();

    }

    private static void printOut() {
        System.out.println("Оценки:");
        System.out.println(Arrays.toString(counts));
    }

    private static void fill() {
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Введите оценку №" + (i + 1) + ":");
            counts[i] = Integer.parseInt(console.nextLine());
        }
    }

    private static void fill(int a, int b, int c, int d, int e){
        counts[0] = a;
        counts[1] = b;
        counts[2] = c;
        counts[3] = d;
        counts[4] = e;
    }
}
