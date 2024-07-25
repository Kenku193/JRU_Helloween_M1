package level12_objects.example2_getterSetter;

import java.util.UUID;

public class App {
    public static void main(String[] args) {

        // 1 ШАГ: СОЗДАЛИ ОБЪЕКТ
        User user = new User(111, "JR", "qwerty");
        System.out.println(user);

        // 2 ШАГ: КАК ДОСТАВАТЬ ПОЛЯ?
        System.out.println(user.getId() + " " + user.getLogin());

        // 3 ШАГ: КАК МЕНЯТЬ ПОЛЯ?
        user.setId(999);
        user.setLogin("Dima");
        System.out.println(user.getId() + " " + user.getLogin());

    }
}
