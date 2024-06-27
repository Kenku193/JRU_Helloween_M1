package level03;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        String text = "10 20 40 80";
//        Scanner console = new Scanner(text);
//        String s = console.nextLine();
        String s = "10 20 40 80";

        System.out.println(s == text);
        System.out.println(s.equals(text));

    }
}
