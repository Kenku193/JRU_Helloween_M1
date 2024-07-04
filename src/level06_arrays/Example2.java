package level06_arrays;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        // 1-й способ
        // int[] ints = new int[10]; // 0

        // 2-й способ
        int[] ints = {1, 10, 99, 100, -20, 56, 90 - 9, 88 * 7}; // на 8 ячеек

        System.out.println(Arrays.toString(ints));

        String[] strings = {"Yura", "Ira", "Dima", "Petya"};

        System.out.println(Arrays.toString(strings));

        // --- --- ---
        // 3-й способ
        int[] a = new int[]{1, 10, 20, 90, 100};

    }
}
