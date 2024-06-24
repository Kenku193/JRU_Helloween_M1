package level02;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
//        String  s       = "Yura";
        Scanner console = new Scanner(System.in);
        String fromConsole =  console.nextLine();
        double d = Double.parseDouble(fromConsole);

        // int a = Integer.parseInt(fromConsole);
//        int fromConsole = console.nextInt();

        System.out.println(d);
    }

}
