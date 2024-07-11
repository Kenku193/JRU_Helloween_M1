package level08_functions;

public class Example2 {
    static int x = 1000;

    public static void main(String[] args) {

        int a = 100;
        System.out.println(a);
        myMethod();

        System.out.println(x);
    }

    public static void myMethod() {
        int a = 10;
        System.out.println(a);
        System.out.println(x);
    }
}
