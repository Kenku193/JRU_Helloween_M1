package level11_oop;

public class Example7 {
    public static void main(String[] args) {

        int a;
        char c = '!';
        a = c;
        System.out.println(a);

        long x = 1;
        int v;
        v = (int) x; // ВПИХИВАЕМ БОЛЬШЕЕ В МЕНЬШЕЕ
        System.out.println(v);

        long y = 1_000_000L;
        byte o; // MAX127

        o = (byte) y;
        System.out.println("Что в переменной o? : "+ o);

        //BYTE: -128 -127 -126 .... 0 1 2 .... 125 126 127

        char n = 0;
        for (int i = 0; i < 65536; i++) {
               c = (char) i;
            System.out.println(i + " " + c);
        }

    }
}
