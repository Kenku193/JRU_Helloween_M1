package level09_strings;

public class Example11 {
    public static void main(String[] args) {

        String str = "Привет, я длинная строка, Я же длинная?";

        System.out.println(str.substring(5, 11));

        System.out.println("повтори".repeat(50));

        System.out.println(str.replace('я', 'Щ'));

        System.out.println("я маленький".toUpperCase());
        System.out.println("Я БОЛЬШОЙ".toLowerCase());

        String trimMe = "     myEmail@google.com    ";
        System.out.println(trimMe);
        String trimmedEmail = trimMe.trim();
        System.out.println(trimmedEmail);

    }
}
