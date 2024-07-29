package level13_classesAndStatic.example2;

public class Application {

    public static void main(String[] args) {

//        System.out.println(Automobile.ManufactureAddress.address);

        System.out.println(Automobile.i);
//      System.out.println(Automobile.u); // u НЕ ВИДНО


        Automobile.MyCrazyClass myCrazyClass1 = new Automobile().new MyCrazyClass();
        myCrazyClass1.myCrazyMethod();

        Automobile.MyCrazyClass myCrazyClass2 = new Automobile().new MyCrazyClass();
        myCrazyClass2.myCrazyMethod();

    }
}


