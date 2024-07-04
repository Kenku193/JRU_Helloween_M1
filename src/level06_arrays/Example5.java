package level06_arrays;

public class Example5 {
    public static void main(String[] args) {

        int[] ar = new int[100];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = i + 100;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        // ОБРАЩАЮСЬ К КРАЙНЕЙ ЛЕВОЙ ЯЧЕЙКЕ -> OK
        System.out.println(ar[99]);

        // ОБРАЩАЮСЬ ЗА ПРЕДЕЛЫ КРАЙНЕЙ ЛЕВОЙ ЯЧЕЙКИ
        System.out.println(ar[100]);



    }
}
