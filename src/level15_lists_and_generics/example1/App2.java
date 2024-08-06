package level15_lists_and_generics.example1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class App2 {
    public static void main(String[] args) {

        char c = '4';

        boolean alphabetic = Character.isAlphabetic(c);

        System.out.println(alphabetic);

        double d1 = 99.9;
        double d2 = 0.1;

        double d3 = d1 + d2;
        System.out.println(d3);

        double sum = Double.sum(d1, d2);

        System.out.println(sum);

    }
}
