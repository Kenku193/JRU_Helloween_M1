package level09_strings;

public class Example3 {
    public static void main(String[] args) {

        int x;
        final int y;

        x = 10;
        y = 20;

        System.out.println(x);
        System.out.println(y);

//        x = 100;
//        y = 200;
//        System.out.println(x);
//        System.out.println(y);

        int a = 555 * 100 / 222;
        System.out.println(a);

        for (int i = 0; i < a; i++) {
            System.out.println("Привет!");
        }

        final String s; // ССЫЛКА НЕИЗМЕННА, НО ОБЪЕКТ МОЖНО ПОМЕНЯТЬ
        s = "JavaRush";
        System.out.println(s);
        // s = "Privet!";

    }
}
