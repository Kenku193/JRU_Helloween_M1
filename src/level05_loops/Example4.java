package level05_loops;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

//        int a = 1;
//        do {
//            System.out.println(a);
//            a++;
//        }
//        while (a < 3);

        Scanner console = new Scanner(System.in);
        String s;

        do {
            System.out.println("Введите строку:");
            s = console.nextLine();
        }
        while (
                !s.equals("exit")
        );

    }
}
