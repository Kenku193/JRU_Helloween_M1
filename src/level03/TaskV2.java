package level03;

import java.util.Scanner;

public class TaskV2 {
    public static void main(String[] args) {

        // ВАЛИДАЦИЯ ПАРОЛЯ
        // ДЛИНА БОЛЕЕ 10 СИМВОЛОВ
        // ДОЛЖЕН СОДЕРЖАТЬ ! ИЛИ . ИЛИ -
        // НЕ ДОЛЖЕН БЫТЬ ПУСТЫМ

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isValid = true;
        // V2
        if (password.length() <= 10
                || password.isBlank()
                || !(password.contains("!") || password.contains("-") || password.contains("."))){
            isValid = false;
        }

        if (isValid){
            System.out.println("Пароль валидный!");
        }
        else {
            System.out.println("Пароль не валидный!");
        }
    }
}
