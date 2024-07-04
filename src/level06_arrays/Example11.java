package level06_arrays;

import java.util.Arrays;

public class Example11 {
    public static void main(String[] args) {

        int[] i = new int[100];

        Arrays.fill(i, 10);

        System.out.println(Arrays.toString(i));

        Arrays.setAll(i, (r) -> 10 * 2);
        System.out.println(Arrays.toString(i));

    }
}
