package level06_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        // immutable for size
        // mutable for value

        int[] ints = new int[10]; // 0
        boolean[] bool = new boolean[10]; // false
        char[] ch = new char[10]; // ''
        String[] str = new String[10]; // null

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(bool));
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(str));



    }
}
