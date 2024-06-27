package level03;

import java.util.Scanner;

public class TaskV1 {
    public static void main(String[] args) {

        // ВАЛИДАЦИЯ ПАРОЛЯ
        // ДЛИНА БОЛЕЕ 10 СИМВОЛОВ
        // ДОЛЖЕН СОДЕРЖАТЬ ! ИЛИ . ИЛИ -
        // НЕ ДОЛЖЕН БЫТЬ ПУСТЫМ

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isValid = true;
        // V1
        // ПРОВЕРЯЕМ НА ТО ЧТО ПУСТОЙ
        if (password.isBlank()) {
            isValid = false;
        }
        // ПРОВЕРЯМ НА СООТВ ДЛИНЕ
        if (password.length() <= 10) {
            isValid = false;
        }
        // ПРОВЕРЯЕМ ЧТО СОДЕРЖАТСЯ СИМВОЛЫ
        if (!(password.contains("!") || password.contains("-") || password.contains("."))) {
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
