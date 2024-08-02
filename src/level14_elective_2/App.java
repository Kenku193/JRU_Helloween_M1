package level14_elective_2;

import java.lang.reflect.Field;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Spoon spoon = new Spoon();
        // СОЗДАЛ ЧАШКУ С ЛОЖКОЙ ВНУТРИ
        Cup cup = new Cup(new Spoon());

        // УНИЧТОЖУ ССЫЛКУ НА ЧАШКУ
        cup = null;
        System.gc();


        Class<Dog> dogClass = Dog.class;
        String name = dogClass.getName();
        System.out.println(name);

    }
}
