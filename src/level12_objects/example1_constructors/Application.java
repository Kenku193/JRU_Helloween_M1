package level12_objects.example1_constructors;

public class Application {

    public static void main(String[] args) {

       // Object u = new User();
        User u = new User();
        System.out.println(u.toString());

        u.equals(null);

        User u1 = new User("Yura", "qwerty");
        System.out.println(u1.toString());

        User u2 = new User(88, "N", "x");
        System.out.println(u2);

    }
}
