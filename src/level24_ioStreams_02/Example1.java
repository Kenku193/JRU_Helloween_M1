package level24_ioStreams_02;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class Example1 {
    public static void main(String[] args) throws FileNotFoundException {
        // 100 int

        try {
            DataOutputStream dataOutputStream = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("data.dat")
                    )
            );

            dataOutputStream.writeInt(10);
            dataOutputStream.writeInt(20);
            dataOutputStream.writeInt(30);
            dataOutputStream.writeInt(40);

//            for (int i = 0; i < 100; i++) {
//                ThreadLocalRandom random = ThreadLocalRandom.current();
//                int value = random.nextInt(1000);
//                dataOutputStream.writeInt(value);
//            }

            dataOutputStream.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
