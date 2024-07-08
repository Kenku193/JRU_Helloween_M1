package level07_multiDimArrays;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        // 3 СТРОКИ - 3 МАССИВА
        // 4 СТОЛБЦА - ПО 4 ЯЧЕЙКИ
        int[][] twoDimArray = {
                {5, 7, 1, 17},
                {7, 0, -10, 22*2},
                {99, 88, 66, 44}
        };

//        for (int i = 0; i < twoDimArray.length; i++) {
//            System.out.println(twoDimArray[i]);
//        }

        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));
        }

        System.out.println("-".repeat(100));

        for (int i = 0; i < 3; i++) { // ИДЕМ ПО СТРОКАМ
            for (int j = 0; j < 4; j++) { // ИДЕМ ПО СТОЛБЦАМ/ЯЧЕЙКАМ
                System.out.print("'" + twoDimArray[i][j] + "'"); // ВЫВОД ЗНАЧЕНИЯ КОНКРЕТНОЙ ЯЧЕЙКИ
            }
            System.out.println();// ПЕРЕНОС СТРОКИ РАДИ ВИЗУАЛЬНОГО СОХРАНЕНИЯ ТАБЛИЧНОЙ ФОРМЫ
        }

    }
}
