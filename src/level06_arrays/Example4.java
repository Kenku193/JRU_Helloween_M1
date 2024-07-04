package level06_arrays;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {

        int[] ar = new int[6];

        ar[0] = 100;
        ar[1] = 200;
        ar[2] = 300;
        ar[3] = 400;
        ar[5] = 500;
        System.out.println(Arrays.toString(ar));

        ar[5] = 900;
        System.out.println(Arrays.toString(ar));

        int L = ar.length; // leght -> спросить у массива его длину
        System.out.println(L);

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

    }
}
