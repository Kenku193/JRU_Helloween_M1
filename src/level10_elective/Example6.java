package level10_elective;

public class Example6 {
    public static void main(String[] args) {

        // ПЕРЕВОД ИЗ 16-чной в 10-чную

        // 0 - 9 A B C D E F

        int a = 0x7846F;

        // 7  8  4  6  F
        // 7  8  4  6  15
        // 4  3  2  1  0

        int x4 = 7 * 16 * 16 * 16 * 16;
        int x3 = 8 * 16 * 16 * 16;
        int x2 = 4 * 16 * 16;
        int x1 = 6 * 16;
        int x = 15;

        System.out.println(x4 + x3 + x2 + x1 + x);
        System.out.println(a);

        // // // // // // // //
        //        32 16 8  4  2  1
        int g = 0b0__0__0__0__0__0; // 0 или 1

        System.out.println(g);

    }
}
