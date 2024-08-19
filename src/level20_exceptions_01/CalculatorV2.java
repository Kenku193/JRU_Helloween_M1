package level20_exceptions_01;

public class CalculatorV2 {
    public static void main(String[] args) {

       int x = division("10", "Yura");
        System.out.println(x);

    }

    static int division(String left, String right){
        int a = Integer.parseInt(left);
        int b = Integer.parseInt(right);

        int result = a / b;

        return result;
    }
}
