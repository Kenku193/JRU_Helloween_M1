package level11_oop;

public class Example2 {

    public static void main(String[] args) {

        String value = "value"; // объект №1
        String newString = value; // две ссылки на объект №1

        System.out.println(newString); //value // "value"

        value = "new value"; // value = "new value" -> newString = "value"

        System.out.println(newString); // value

       // - Почему содержимое в переменной value изменилось,
        // а в переменной newString осталось старым, если у этих переменных одна ссылка?/
    }
}
