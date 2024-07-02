package level02_datatypes;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число и строку");
        double d = scanner.nextDouble();
        d = scanner.nextDouble();
        d = scanner.nextDouble();
        String s = scanner.nextLine();

        System.out.println(s + " " + d);

    }
}
