package level02;

public class Example1 {
    public static void main(String[] args) {

        byte b = 127; // -128 ...... 0 .... 127
        System.out.println(Byte.MIN_VALUE);

        short s = -30000;

        int i  = 1_400_999_000;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        long l = 1039283248L;

        System.out.println(Long.MAX_VALUE);

        // --- --- --- --- --- --- --- --- ---

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        float f = 44.12F;
        double d = 98.99D;

    }
}
