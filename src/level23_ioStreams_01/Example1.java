package level23_ioStreams_01;

import java.io.*;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        // InputStream который читаем из файла в подготовленный массив байт

        // Мы можем читать БАЙТЫ из любого файла - хоть текстового, хоть аудио, хоть изображения
        // Все файлы это просто наборы байт

        try{
            InputStream inputStream = new FileInputStream("src/level23_ioStreams_01/input.txt");

            int available = inputStream.available();
            System.out.println("Кол-во входных байт: " + available);

            byte[] array = new byte[available];

            inputStream.read(array);

            System.out.println("Прочитанная информация");
            System.out.println(Arrays.toString(array));

            String s = new String(array);
            System.out.println(s);

            inputStream.close();

            byte[] anotherArray = new byte[5];
            System.out.println(Arrays.toString(anotherArray));
            anotherArray[0] = 49;
            System.out.println(Arrays.toString(anotherArray));

            String s1 = new String(anotherArray);
            System.out.println(s1);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден!");
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
