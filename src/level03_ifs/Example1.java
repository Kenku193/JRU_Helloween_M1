package level03_ifs;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вам полных лет?");

        int age = scanner.nextInt();

        if (age > 17) {
            System.out.println("Совершеннолетний, покупай авто!");
            System.out.println("Самое лучшее авто!");
        }
        else {
            System.out.println("Рано еще для машин");
            System.out.println("Привет!");
        }



    }
}
