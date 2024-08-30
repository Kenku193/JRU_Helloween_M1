package level24_ioStreams_02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) throws IOException {

        // Path path = Path.of("src/level24_ioStreams_02/myFile.txt");
        // Path path = Path.of("src", "level24_ioStreams_02", "myFile.txt");

        String format = ".txt";
        String fileName = "myFile" + format;
        // /Users/mentor/Desktop/JR_Projects/Helloween/JRU_Helloween_M1/src/level24_ioStreams_02/myFile.txt
        Path path = Path.of(
               "src",
               "level24_ioStreams_02",
               fileName
               );

        System.out.println(path);

//        List<String> strings = Files.readAllLines(path);
//        for (String string : strings) {
//            System.out.println(string);
//        }

        BufferedReader bufferedReader = Files.newBufferedReader(path);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }


    }
}
