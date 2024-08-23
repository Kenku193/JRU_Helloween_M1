package level21_exceptions_02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPaste {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/Users/mentor/Desktop/file.txt");
        FileWriter fileWriter = new FileWriter("/Users/mentor/Desktop/copy_of_file.txt");
        try {
            while (fileReader.ready()){
                int symbol = fileReader.read();
                fileWriter.write(symbol);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            fileReader.close();
            fileWriter.close();
        }
    }
}
