package level08_functions.example9_1;

import level08_functions.example9_2.Example9_2;

public class Example9_1 {

    public static void main(String[] args) {

        // ВЫЗЫВАЮ СТАТИЧЕСКИЙ МЕТОД НА КЛАССЕ
        Example9_2.myStaticMethod();

        // ВЫЗЫВАЮ НЕ СТАТИЧЕСКИЙ МЕТОД НА ОБЪЕКТЕ
        Example9_2 example9_2 = new Example9_2();
        example9_2.myNonStaticMethod();

    }

}
