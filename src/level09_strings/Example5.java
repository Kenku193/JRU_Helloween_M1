package level09_strings;

public class Example5 {

    public int count = 0;
    public int sum = 0;

    public void someMethod(int data) {
        sum = sum + data; // Я ИСПОЛЬЗУЮ ПЕРЕМЕННУЮ SUM ИЗ СТРОКИ 6
        System.out.println(sum); // ПОЛУЧУ СУММУ sum И data
        int sum = data * 2; // ОБЪЯВЛЯЮ ДРУГУЮ int sum - ЗАТЕНЯЮЩУЮ
        System.out.println(sum); // ВЫВОЖУ ЗАТЕНЯЮЩЮЮ sum НА КОНСОЛЬ

        System.out.println(this.sum); // ВЫВОЖУ ВЕРХНЕУРОВНЕВУЮ sum НА КОНСОЛЬ

    }

    public static void main(String[] args) {
        Example5 example5 = new Example5();
        example5.someMethod(5);

    }
}
