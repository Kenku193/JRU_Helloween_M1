package level07_multiDimArrays;

import java.util.Scanner;

public class Pyramide2 {
    //        Напишем программу для рисования пирамиды с заданной высотой.
    //        В классе Solution дан двумерный массив символов (поле array). Необходимо:
    public static char[][] array;

    public static void main(String[] args) {

        //        считать число с клавиатуры — это и будет высота пирамиды;
        Scanner console = new Scanner(System.in);
        int h = console.nextInt();

//        инициализировать массив array соответствующим значением;
        array = new char[h][];
        for (int i = 0; i < array.length; i++) {
            int s = i + 1;
            array[i] = new char[h + s];
        }

        // ВРЕМЕННО ЗАПОЛНИТЬ ГОТОВЫЙ ПУСТОЙ МАССИВ РЕШЕТКАМИ
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '#';
            }
        }

        // РЕШИТЬ КАК ЗАМЕНИТЬ ЧАСТЬ РЕШЕТОК В ЛЕВОЙ СТОРОНЕ НА ПРОБЕЛЫ
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < ; j++) {
//                array[i][j]=' ';
//            }
//        }


//        вывести массив на экран в таком виде, как в примере (каждую строку отдельно).
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

//
//        Требования:
//•	В программе нужно считывать число с клавиатуры.
//•	Поле array необходимо проинициализировать массивом подходящего размера.
//•	Массив array необходимо заполнить согласно условию.
//•	В программе нужно вывести элементы массива на экран (см. пример в условии).

    }
}
