package level10_elective;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Example10 {
    public static void main(String[] args) {

        // Иванов Майкл Джексонович   +155500077711 ,,,   47423742378293423432000

        String s = new String("fjdsk fdsfdsfsd");
        String[] s1 = s.split(" ");

        StringBuilder sb = new StringBuilder("Иванов Майкл Джексонович ,,,,  +155500077711 ,,, 47423742378293423432000");
        String s2 = sb.toString();
        System.out.println(s2);

        StringTokenizer tokenizer = new StringTokenizer(s2, " ,");

        int count = tokenizer.countTokens();
        String[] dataBase = new String[count];

        int index = 0;

        while (tokenizer.hasMoreTokens()){
            dataBase[index++] = tokenizer.nextToken();
        }

        System.out.println(Arrays.toString(dataBase));

    }
}
