package level07_multiDimArrays;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        int[] mAyyray = new int[10];
        System.out.println(
                Arrays.toString(mAyyray)
        );

        int[][] twoDimArray;
        String[][][] threeDimArray;
        double[][][][][] fiveDimArray;

        // УСЛОВНО, ЭТО ТАК -> создать 3 одномерных массива, длиной 4 элемента
        // 3 СТРОКИ
        // 4 СТОЛБЦА
        int[][] twoDimensionalArray = new int[3][4];

        twoDimensionalArray[0][0] = 100;
        twoDimensionalArray[0][1] = 101;
        twoDimensionalArray[0][2] = 102;
        twoDimensionalArray[0][3] = 103;

        twoDimensionalArray[1][0] = 200;
        twoDimensionalArray[1][1] = 201;
        twoDimensionalArray[1][2] = 202;
        twoDimensionalArray[1][3] = 203;

        twoDimensionalArray[2][0] = 300;
        twoDimensionalArray[2][1] = 301;
        twoDimensionalArray[2][2] = 302;
        twoDimensionalArray[2][3] = 303;

        System.out.println(
                Arrays.deepToString(twoDimensionalArray)
        );

    }
}
