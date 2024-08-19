package level20_exceptions_01;

import java.io.File;

public class CalculatorV5{
    public static void main(String[] args) throws RuntimeException, Error {
        int x = division("10", "uru");
        System.out.println(x);
    }

    static int division(String left, String right) throws RuntimeException, Error {
        int result;
        try {
            int a = Integer.parseInt(left);
            int b = Integer.parseInt(right); // Yura???
            result = a / b; // Arifmetic
        }
        catch (ArithmeticException ae) {
            System.out.println("А Я ВЗЯЛ И ПЕРЕХВАТИЛ ИСКЛЮЧЕНИЕ ДЛЯ ЧИСЕЛ!");
        }
        catch (NumberFormatException nfe){
            System.out.println("А Я ВЗЯЛ И ПЕРЕХВАТИЛ ИСКЛЮЧЕНИЕ ДЛЯ ПАРСИНГА!");
        }
        finally {
            System.out.println();
            return result = 111;// ПЛОХО!
        }
    }
}
