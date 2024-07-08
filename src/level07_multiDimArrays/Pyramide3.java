package level07_multiDimArrays;

import java.util.Scanner;

public class Pyramide3 {

    public static char[][] array;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int height = console.nextInt();

        array = new char[height][height * 2 - 1];


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j >= (height - 1 - i) && j <= (height - 1 + i)) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1]);
            }
            System.out.println();
        }
    }
}
