package level15_lists_and_generics.example2;

import java.util.ArrayList;

public class App3 {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        Integer i1 = 10;
        Integer i2 = 20;
        Integer i3 = 30;
        Integer i4 = 40;

        integerArrayList.add(i1);
        integerArrayList.add(i3);
        integerArrayList.add(i4);
        integerArrayList.add(i2);
        integerArrayList.add(99);

        ArrayList arrayList = new ArrayList(); // Object?

        Object o = new Object();
        String s = new String("privet");
        Integer integer = 888;
        Boolean b = false;

        arrayList.add(o);
        arrayList.add(s);
        arrayList.add(integer);
        arrayList.add(b);



    }
}
