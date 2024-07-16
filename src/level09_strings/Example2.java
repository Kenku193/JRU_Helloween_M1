package level09_strings;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

      // Если
//        // при парсинге работает строка внизу
//        System.out.println(Double.parseDouble("1.0"));  // вывод 1.0
//        // и не работает следующая строка внизу - выдается исключение java.lang.NumberFormatException: For input string: "1,0"
//        System.out.println(Double.parseDouble("1,0"));  // вывода не происходит

        // То почему
        // Работает конструкция ниже
        Scanner scanner2 = new Scanner("1,");
        double doubleNumber1 = scanner2.nextDouble();
        System.out.println(doubleNumber1);  // вывод 1.0

        // И не работает вот эта конструкция - выдается исключение java.util.InputMismatchException
        Scanner scanner3 = new Scanner("1.");
        double doubleNumber2 = scanner3.nextDouble();
        System.out.println(doubleNumber2);  // вывода не происходит

    }
}
