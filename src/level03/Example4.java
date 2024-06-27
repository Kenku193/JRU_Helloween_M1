package level03;

public class Example4 {
    public static void main(String[] args) {

        int temperature = 18;

//        if (temperature > 20)
//            System.out.println("надеть рубашку"); // НЕ СРАБАТЫВАЕТ
//        else {
//            if (temperature > 10)
//                System.out.println("надеть свитер"); // НЕ СРАБАТЫВАЕТ
//            else {
//                if (temperature > 0)
//                    System.out.println("надеть плащ"); // СРАБАТЫВАЕТ
//                else
//                    System.out.println("надеть пальто"); // СЮДА ДАЖЕ НЕ ДОХОДИТ
//            }
//        }

        boolean result = true;
        System.out.println(result);

        if (temperature > 20) {
            System.out.println("надеть рубашку");
        }
        else if (temperature > 10) {
            System.out.println("надеть свитер");
        }
        else if (temperature > 0) {
            System.out.println("надеть плащ");
        }
        else {
            System.out.println("надеть пальто");
        }
    }
}
