package level23_ioStreams_01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        try {
            InputStream inputStream = System.in;

            System.out.println(inputStream.available());

            byte[] bytes = inputStream.readNBytes(40);

            //byte[] array = inputStream.readAllBytes();

        }
        catch (IOException e){
            System.out.println("Не удалось прочитать");
        }


    }
}
