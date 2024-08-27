package level23_ioStreams_01;

import java.io.*;

public class Example5 {
    public static void main(String[] args) throws IOException {

        OutputStream outputStream = new FileOutputStream("src/level23_ioStreams_01/output.txt");
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97, 82, 117, 115, 104};
        outputStream.write(bytes);

        outputStream.close();

        Writer writer = new FileWriter("src/level23_ioStreams_01/outputFromString.txt");
        String s = "Pied Piper";
        writer.write(s);
        writer.close();

    }
}
