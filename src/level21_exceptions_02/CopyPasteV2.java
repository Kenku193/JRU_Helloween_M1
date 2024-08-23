package level21_exceptions_02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPasteV2 {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("/Users/mentor/Desktop/file.txt");
             FileWriter fileWriter = new FileWriter("/Users/mentor/Desktop/copy_of_file.txt"))
        {
            while (fileReader.ready()){
                int symbol = fileReader.read();
                fileWriter.write(symbol);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            System.out.println();
            // ДОПИШУТСЯ ЕЩЕ ВСЕ close()-МЕТОДЫ К РЕСУРСАМ
        }
    }
}

// СВОЙ СОБСТВЕННЫЙ КЛАСС КОТОРЫЙ ЧТО_ТО ДЕЛАЕТ С ФАЙЛАМИ myClass implements AutoClosable -> close()