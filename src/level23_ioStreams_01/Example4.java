package level23_ioStreams_01;

import java.io.*;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("src/level23_ioStreams_01/input.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        System.out.println(reader.readLine());
        System.out.println(reader.readLine());

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String s = reader1.readLine();
        String s1 = reader1.readLine();
        String s2 = reader1.readLine();
        String s3 = reader1.readLine();



    }
}
