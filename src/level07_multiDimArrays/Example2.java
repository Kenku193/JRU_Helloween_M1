package level07_multiDimArrays;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        // 3 СТРОКИ - 3 МАССИВА
        // 4 СТОЛБЦА - ПО 4 ЯЧЕЙКИ
        int[][] twoDimArray = {
                {5, 7, 1, 17},
                {7, 0, -10, 22*2},
                {99, 88, 66, 44}
        };

        System.out.println(Arrays.deepToString(twoDimArray));

        int[] line1 = twoDimArray[0];
        System.out.println(Arrays.toString(line1));

        int[] line2 = twoDimArray[1];
        System.out.println(Arrays.toString(line2));

        int[] line3 = twoDimArray[2];
        System.out.println(Arrays.toString(line3));

        System.out.println(line1[3]);

        // ТО ЖЕ САМОЕ
        System.out.println(twoDimArray[0][3]);

    }
}
