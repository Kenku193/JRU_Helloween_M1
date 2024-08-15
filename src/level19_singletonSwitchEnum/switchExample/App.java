package level19_singletonSwitchEnum.switchExample;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        switch (s)
        {
            case "Куся": {
                System.out.println("Кот - " + s);
            }
                break;
            case "Тяпа":
                System.out.println("Тоже кот - " + s);
                break;
            case "Ляля":
                System.out.println("Кошка - " + s);
            default:
                System.out.println("Твоего кота нет в списке! " + s);
        }
    }
}
