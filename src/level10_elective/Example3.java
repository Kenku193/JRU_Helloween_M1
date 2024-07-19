package level10_elective;

public class Example3 {
    public static void main(String[] args) {

        double a = 2.73646426216123;
        double b = 4.05E-13; // 4.05 * 10 ^ -13

        double p = 0b001011010;
        System.out.println("Я дабл в 16-чной: " + p);

        System.out.println(a);
        System.out.println(b);

        System.out.println(a + b);

        float f = 2.73646426216123F;
        float u = 4.05E-13F;

        float x = 0x001321fff; // !!!
        System.out.println(x);

    }
}
