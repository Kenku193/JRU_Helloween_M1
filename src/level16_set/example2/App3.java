package level16_set.example2;

import java.util.HashSet;
import java.util.Iterator;

public class App3 {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(22);
        numbers.add(23);
        numbers.add(26);
        numbers.add(28);
        numbers.add(91);
        numbers.add(0);
        numbers.add(-111);
        numbers.add(-2314321);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
//            numbers.remove(0);
//            iterator.remove();
        }


//        for (Integer i : numbers) {
//            System.out.println(i);
//        }

    }

}
