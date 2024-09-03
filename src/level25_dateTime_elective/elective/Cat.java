package level25_dateTime_elective.elective;

import java.util.HashMap;
import java.util.LinkedList;

public class Cat {

    static int a = 10;

    static String domain;

    String name;
    String poroda;
    int age;

    static {
        domain = "Кошачьи";
    }

    {
        System.out.println("Это нестатический блок!");
        name = "Стандартное имя";
        poroda = "Дворовой";
        age = 1;
    }

    public Cat() {
    }

    public Cat(String name, String poroda, int age) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
    }
}

class Appli {
    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat.age);

        System.out.println(Cat.domain);

    }
}
