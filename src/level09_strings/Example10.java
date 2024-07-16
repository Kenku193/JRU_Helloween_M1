package level09_strings;

public class Example10 {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "Hello World!!!!";
        String str3 = "hello world";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str3.compareTo(str1));
        System.out.println(str3.compareToIgnoreCase(str1));

        System.out.println("starts/ends with example");
        boolean hel = str1.startsWith("Hel");
        boolean yura = str1.startsWith("Yura");
        System.out.println(hel);
        System.out.println(yura);

        boolean b = str1.endsWith("!");
        System.out.println(b);

        int ello = str1.indexOf("ello");
        System.out.println(ello);

        String space = " ";
        boolean matches = space.matches(" ");
        System.out.println(matches);

//        ******@*****.ru
//        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
    }
}
