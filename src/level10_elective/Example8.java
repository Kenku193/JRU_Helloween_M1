package level10_elective;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        Scanner console = new Scanner(System.in);

        for (;;) {
            String line = console.nextLine();
            if (line.equals("end")){
                break;
            }
           sb.append(line + " ");

        }
        System.out.println(sb);

    }
}
