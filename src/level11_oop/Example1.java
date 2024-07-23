package level11_oop;

import org.w3c.dom.ls.LSOutput;

public class Example1 {

    static int x; // ПОЛЕ КЛАССА
    static double d; // ПОЛЕ КЛАССА
    static long l; // ПОЛЕ КЛАССА

//   static float f;

    public static void main(String[] args) {

        float f = 0.0F;
        System.out.println(f);

        System.out.println(x);
        System.out.println(d);
        System.out.println(l);

        doNothing(48991);
        doNothing(48991L);
        doNothing(489.03F);
        doNothing(48991.01);

        System.out.println(Integer.BYTES); // 4 байта
        System.out.println(Integer.SIZE); // 32 бита

        System.out.println(Long.SIZE);

        char c = 'a';
    }

    public static void doNothing(int a) {
    }

    public static void doNothing(long a) {
    }

    public static void doNothing(float a) {
    }

    public static void doNothing(double a) {
    }


}
