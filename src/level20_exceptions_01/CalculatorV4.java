package level20_exceptions_01;

public class CalculatorV4 {
    public static void main(String[] args) {

        int x = 0;
        try {
            x = division("10", "0.1");
        }
        catch (ArithmeticException ae) {
            System.out.println("А Я ВЗЯЛ И ПЕРЕХВАТИЛ ИСКЛЮЧЕНИЕ ДЛЯ ЧИСЕЛ!");
        }
        catch (NumberFormatException nfe){
            System.out.println("А Я ВЗЯЛ И ПЕРЕХВАТИЛ ИСКЛЮЧЕНИЕ ДЛЯ ПАРСИНГА!");
        }

    }

    static int division(String left, String right){
        int a = Integer.parseInt(left);
        int b = Integer.parseInt(right); // Yura???

        int result = a / b; // Arifmetic

        return result;
    }
}
