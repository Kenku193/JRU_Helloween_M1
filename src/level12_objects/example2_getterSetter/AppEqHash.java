package level12_objects.example2_getterSetter;

import level11_oop.Cat;

public class AppEqHash {
    public static void main(String[] args) {

        User user1 = new User(10, "Ivan", "12345!!!");
        User user2 = new User(101, "Ivano ", "12345!!!!");

        User user3 = user1;

        Cat cat = new Cat();

        System.out.println(user1 == user2);

        boolean b = user1.equals(user2); // ???
        System.out.println(b);

        System.out.println("-".repeat(100));

        int u1Hash = user1.hashCode();
        int u2Hash = user2.hashCode();

        System.out.println(u1Hash);
        System.out.println(u2Hash);

    }
}
