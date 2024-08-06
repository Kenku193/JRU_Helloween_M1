package level15_lists_and_generics.example2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App6 {
    public static void main(String[] args) {

        String s = "10";
        var x = true;

        var list = new ArrayList<>(); // Variable / list для Object'ов

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add((Integer) 1);

        double d = 111.0;

        integerArrayList.add((int) d);

    }
}
