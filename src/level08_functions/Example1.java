package level08_functions;

public class Example1 {

    // СПЕЦИАЛЬНЫЙ МЕТОД Java - ТОЧКА ВХОДА
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            printWifiInConsole();
        }

        System.out.println("После вызова метода");
    }

    public static void printWifiInConsole() {
        System.out.print("Yu");
        System.out.println("Ra");

        String[] s = new String[10];

        main(s);
    }

}
