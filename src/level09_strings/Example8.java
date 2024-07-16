package level09_strings;

public class Example8 {
    public static void main(String[] args) {

        String s = "Привет";

        String s1 = new String("Привет");

        s1.intern(); // ПЕРЕДАСТ МОЮ СТРОКУ ИЗ ПЕРЕМЕННОЙ s1 В ПУЛ СТРОК!

        String str1 = "JavaRush";
        String str2 = "JavaRush"; // ИДЕТ В ПУЛ СТРОК И СМОТРИТ НЕТ ЛИ ТАМ ТАКОГО-ЖЕ ТЕКСТА?
        String str3 = new String("JavaRush"); // МЕНЯ В ПУЛЕ СТРОК НЕТ!
        String str4 = (new String("JavaRush")).intern(); // МЕНЯ НАСИЛЬНО ЗАГНАЛИ В ПУЛ СТРОК

        // СРАВНИВАЮ ССЫЛКИ

        System.out.println("Ссылка 1 равна ссылке 2? : " + (str1 == str2));
        System.out.println("Ссылка 1 равна ссылке 2? : " + (str1 == str3));
        System.out.println("Ссылка 2 равна ссылке 3?: " + (str2 == str3));
        System.out.println("Ссылка 3 равна ссылке 4? : " + (str3 == str4));

        System.out.println("Ссылка 1 равна ссылке 4? : " + (str1 == str4));
        System.out.println("Ссылка 2 равна ссылке 4? : " + (str2 == str4));

    }
}
