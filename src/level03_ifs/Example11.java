package level03_ifs;

public class Example11 {
    public static void main(String[] args) {

//        String s1 = "Yura";
//        String s2 = "yura";

        String s1 = new String("yura");
        String s2 = new String("Yura");

        boolean e1 = s1.equals(s2);// СРАВНЕНИЕ ПО СОДЕРЖИМОМУ
        boolean e2 = s1.equalsIgnoreCase(s2);

        System.out.println(e2);

    }
}
