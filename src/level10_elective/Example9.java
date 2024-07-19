package level10_elective;

public class Example9 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Я то, что было здесь всегда \n");

        // ПОЧИТАЙТЕ! ЭТО НАША ПЕРВАЯ ВСТРЕЧА С ПАТТЕРНАМИ ПРОЕКТИРОВАНИЯ - ПАТТЕРН Builder

        sb.append("Привет!").append(" я креветка").append(" я вкусная");

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(7, 10);
        System.out.println(sb);

        int a = 200;
        String s = "воттакаяястрока";
        System.out.printf("Я число %d, а я строка %s \n", a, s);
        System.out.printf("Я число %d, а я строка %s \n", 999, "Hello!");

        Object o = new Object();
        String s1 = o.toString();

        MyOwnClass myOwnClass = new MyOwnClass();
        String s2 = myOwnClass.toString();
        System.out.println(s2);

    }
}
