package level13_classesAndStatic.example2;

public class Automobile {

    public static int i = 10; // 1
    private static int u = 10; // 1

    int x = 222; // 3
    String y = "Y"; // 3

    public Automobile() { // 4
    }

    private static class ManufactureAddress {

        String g = "G"; // 5

        static String address = "улица Автомобильная, 11"; // 2

        public ManufactureAddress() { // 6
        }

        public static void main(String[] args) {
            System.out.println(i);
            System.out.println(u);
        }
    }

    class MyCrazyClass {

        void myCrazyMethod() {
            System.out.println(MyCrazyClass.class + " I do nothing");
        }

    }
}
