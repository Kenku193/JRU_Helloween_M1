package level07_multiDimArrays;

public class Example4 {
    public static void main(String[] args) {

        int[] array = {5, 19, 0, 81, 5423, 324};

        for (int i : array) {
            System.out.print("|" + i + "|");
        }

        // 3 СТРОКИ - 3 МАССИВА
        // 4 СТОЛБЦА - ПО 4 ЯЧЕЙКИ
        int[][] twoDimArray = {
                {5, 7, 1, 17},
                {7, 0, -10, 22*2},
                {99, 88, 66, 44}
        };

        for (int[] strings : twoDimArray) {
            for (int c : strings) {
                System.out.print(c);
            }
            System.out.println();
        }


    }
}
