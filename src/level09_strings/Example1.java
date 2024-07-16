package level09_strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) throws FileNotFoundException {

        //Почему при закоментированном scanner.close(); код работает,
        //а если раскоментировать scanner.close(); - выдается исключение
        //java.util.NoSuchElementException: No line found

//      Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(new File("/Users/mentor/Desktop/file 2.txt"));
        String s = scanner.nextLine();
        System.out.println(s);
        scanner.close();

        Scanner scanner1 = new Scanner(System.in);
        String s1 = scanner1.nextLine();
        scanner1.close();

    }
}
