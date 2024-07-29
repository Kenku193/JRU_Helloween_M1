package level13_classesAndStatic.example1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Auto.printCount();

        Auto auto1 = new Auto(); // count++;
        Auto auto2 = new Auto(); // count++;
        Auto auto3 = new Auto(); // count++;

        Auto.printCount();

    }
}
