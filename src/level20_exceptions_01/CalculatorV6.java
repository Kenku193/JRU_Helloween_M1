package level20_exceptions_01;

public class CalculatorV6 {
    public static void main(String[] args) {

        int x = 0;
        try {
            x = division("10", "0");
        }
        catch (ArithmeticException | NumberFormatException e) {
            System.out.println("А Я ВЗЯЛ И ПЕРЕХВАТИЛ!");
            System.out.println(e.getClass());
        }
        catch (IllegalArgumentException iae){
            System.out.println("А Я ВЗЯЛ И ПЕРЕХВАТИЛ!");
        }

    }

    static int division(String left, String right) {
        if (left == null || right == null) { // МНЕ НЕ ПОДХОДИТ ОДИН ИЗ АРГУМЕНТОВ, ПОТОМУ ЧТО ОН null
            throw new IllegalArgumentException("argument is null");
        }

        int a = Integer.parseInt(left);
        int b = Integer.parseInt(right); // Yura???

        int result = a / b; // Arifmetic

        return result;
    }
}
