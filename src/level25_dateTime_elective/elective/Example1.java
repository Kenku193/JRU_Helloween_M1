package level25_dateTime_elective.elective;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

//        1) Зачем нам блок finally, если мы можем просто прописать код после всех try-catch и он все равно выполнится?

        try{
            FileReader fileReader = new FileReader("src/level25_dateTime_elective/elective/myFile1.txt");
            char[] chars = new char[30];
            while (fileReader.ready()){
                fileReader.read(chars);
            }
            System.out.println(Arrays.toString(chars));
        }
        catch (IOException e) {
            System.out.println(e.toString());
            Error x = new Error();
            throw x;
        }
        finally {
            System.out.println("А Я БЛОК finally");
        }

       System.out.println("КАКАЯ-ТО РАБОТА ПОСЛЕ TRY-CATCH");


//        2) В чем смысл использования конструкции try-finally или даже просто try? Если мы все равно не перехватываем исключения?
//        3) В чем разница throw и throw new (имеется ввиду применение в блоке catch)
//        4) В стек можно добавлять элементы через add. В чем практическая разница между add и  push?
//        5) В статье https://javarush.com/groups/posts/1944-iskljuchenija-checked-unchecked-i-svoi-sobstvennihe сказано, "Непроверяемые исключения не нужно обрабатывать в блоках try-catch или пробрасывать наверх, хотя технически это возможно, как и с Error."  П
//        онятно, что пробрасывать их смысла нет, но почему не нужно перехватывать в try-catch?
//        Даже на вебинаре рассматривали перехват непроверяемых исключений
//        6) В лекции 22 уровень, 2 лекция про "отлов" Error-ов сказано:
//        "Поэтому лучше использовать класс Throwable, который может поймать и исключения типа Error, и Exception."

    }
}
