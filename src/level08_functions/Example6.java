package level08_functions;

public class Example6 {
    public static void main(String[] args) {
        int[][] array = {{31, 28}, {31, 30, 31}, {30, 31, 31}};
        fill(array, 8);
    }

    public static void fill(int[][] data, int value) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = value;
            }
        }
    }
}
