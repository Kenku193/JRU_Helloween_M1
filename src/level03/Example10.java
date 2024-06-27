package level03;

public class Example10 {
    public static void main(String[] args) {

//        String s1 = "Yura";
//        String s2 = "Yura";

        String s1 = new String("Yura");
        String s2 = new String("Yura");

        boolean b = s1 == s2; // МЫ СРАВНИВАЕМ ССЫЛКИ! А НЕ СОЖЕРЖИМОЕ ТЕКСТА

        System.out.println(b);

    }
}
