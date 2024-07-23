package level11_oop;

public class CatExample {
    public static void main(String[] args) {

        Cat firstCat;
        firstCat = new Cat();
        firstCat.age = 5;
        firstCat.name = "Barsik";
        firstCat.meow();


        Cat anotherCat = new Cat();
        anotherCat.age = 100;
        anotherCat.name = "OldMF";
        anotherCat.meow();

        System.out.println(firstCat);
        System.out.println(anotherCat);

        System.out.println("-".repeat(100));

        Cat thirdCat = new Cat();
        System.out.println(thirdCat);
        System.out.println(thirdCat.age); // 0
        System.out.println(thirdCat.name); // null

        Tiger t = new Tiger();
        t.age = 10;
        t.name = "Mufasa";

        t.meow();
        t.roar();

        t.kills = 1000;



    }
}
