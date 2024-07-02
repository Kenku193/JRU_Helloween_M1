package level03_ifs;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        // В ЭТОЙ ТОЧКЕ ПОЛУЧИЛИ СТРОКУ
        String s = scanner.nextLine();

        System.out.println("БУДЕМ СРАВНИВАТЬ СО СЛОВОМ JavaRush");
        String javaRush = "JavaRush";

        boolean b = javaRush.equals(s);

        System.out.println(b);
    }
}
