package level10_elective;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String data = "";

        for (;;) {
            String line = console.nextLine();
            if (line.equals("end")){
                break;
            }
            data = data + " " + line;
        }

        System.out.println(data);

    }
}
