package level08_functions;

public class Example4 {

    public static void main(String[] args) { // args? -> arguments "+Xm2048", "???", ""
        // ВЫЗОВ УМНОЖАТОРА ПО СПОСОБУ 1
//        multiply(3, 9);

        // ВЫЗОВ УМНОЖАТОРА ПО СПОСОБУ 2
        int x = multiply(3, 9); // 27
        System.out.println(x);

        summator(10, "1897"); //
    }

    // УМНОЖАТОР СПОСОБ 1
//    public static void multiply(int a, int b){
//        int result = a * b;
//        System.out.println(result);
//    }

    // УМНОЖАТОР СПОСОБ 2
    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static void summator(int x, String y) {
        System.out.println(x + Integer.valueOf(y));
    }

}
