package level05_loops;

import java.util.Scanner;

public class Example8_summ {

    public static void main(String[] args) {

        // com.javarush.task.pro.task04.task0403;
        // СУММИРОВАНИЕ

        Scanner console = new Scanner(System.in);
        int summ = 0;

        while (true){
            String s = console.nextLine();
            if (s.equals("ENTER")){
                System.out.println(summ);
                break;
            } else {
                summ = summ + Integer.parseInt(s);
            }
        }
    }
}
