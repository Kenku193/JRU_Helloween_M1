package level20_exceptions_01;

public class CalculatorV3 {
    public static void main(String[] args) {

        try { // ПОПЫТАЙСЯ ВЫПОЛНИТЬ ДАННЫЙ КОД
            int x = division(1, 0);
        }
        catch (ArithmeticException excptn){ // ПЕРЕХВАТЫВАЕМ ИСКЛЮЧЕНИЕ
          System.out.println("А Я ВЗЯЛ И ПЕРЕХВАТИЛ ИСКЛЮЧЕНИЕ!");
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        return;
    }

    static int division(int a, int b){
        int result = a / b; // РОЖДАЕТ ИСКЛЮЧЕНИЕ И ВЫБРАСЫВАЕТ ЕГО
        return result;
    }
}
