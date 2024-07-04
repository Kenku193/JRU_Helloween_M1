package level06_arrays;

public class Example7 {
    public static void main(String[] args) {
        //                    0      1       2       3         4        5
        String[] strings = {"One", "Two", "Three", "Five", "Eleven", "Twelve"};

        System.out.println(strings[5]);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        // for each -> для каждого
        // (СОЗДАЕТСЯ 1 ПЕРЕМЕННАЯ ТОГО ЖЕ ТИПА, ЧТО И ДАННЫЕ В МАССИВЕ)
        // (УКАЗЫВАЕТСЯ РАЗДЕЛИТЕЛЬ В ВИДЕ ДВОЕТОЧИЯ)
        // (УКАЗЫВАЕТСЯ ТОТ МАССИВ, ПО КОТОРОМУ МЫ ИДЕМ)
        for (String s : strings) {
            System.out.println(s.toUpperCase());
        }

    }
}
