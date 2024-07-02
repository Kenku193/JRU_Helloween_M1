package level05_loops;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

//        int n = 100;
//
//        while (n > 0){
//            System.out.println("Hello!");
//            int x = 2 * 2;
//            n--;
//        }
//
//        System.out.println("The end of cycle");

//        boolean b = true;
//        int x = 0;
//        while (b){
//            System.out.println("Yura");
//            x++;
//            if (x == 100) {
//                b = false;
//            }
//        }

        boolean b = true;
        while (b) {
            System.out.println("Введите строку:");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();

            if (s.equals("exit")) {
                b = false;
            }else {
                System.out.println(s + "!!!!!");
            }

        }

    }
}
