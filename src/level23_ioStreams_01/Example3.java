package level23_ioStreams_01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {

        try {
            Reader reader = new FileReader("src/level23_ioStreams_01/input.txt");
            System.out.println("Есть ли что-то в потоке? ->>> " + reader.ready());

            char[] chars = new char[50];

            reader.read(chars);

            System.out.println("Результат:");
            System.out.println(Arrays.toString(chars));

        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден!");
        }
        catch (IOException e) {
            System.out.println("Ошбика!");
        }


    }
}

