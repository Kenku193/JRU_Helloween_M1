package level24_ioStreams_02;

import java.io.*;
import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("data.dat")))))
        {
            while (dataInputStream.available() > 0){
                int i = dataInputStream.readInt();
                list.add(i);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(list);

    }
}
