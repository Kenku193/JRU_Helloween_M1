package level02_datatypes;

public class Example2 {
    public static void main(String[] args) {

        String s1 = "Yura";
        String s2 = "Yura";

        //Если создаем еще одну строку такой же текст Yura,
        // она же не создается?
        // просто возвращает старую ссылку?

        String str = new String("Yura");
        String str2 = new String("Yura");

    }
}
