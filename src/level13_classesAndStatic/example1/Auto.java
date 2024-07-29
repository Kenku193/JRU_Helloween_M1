package level13_classesAndStatic.example1;

public class Auto {

    String color;
    int value;
    int power;
    String brand;

    static int count;

    public Auto() {
        count++;
    }


    static void printCount(){
        System.out.println(count);
    }

    public static void myMethodInAuto(){
        System.out.println("Я статический, а ты - нет!");
    }

    public void myAnotherMethodInAuto(){
        System.out.println("А я обычный!");
    }

}
