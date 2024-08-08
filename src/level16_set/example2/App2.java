package level16_set.example2;

import java.util.*;

public class App2 {
    public static void main(String[] args) {

        // ВЫЧИСЛИТЬ КОЛ-ВО УНИКАЛЬНЫХ ЧИСЕЛ В СПИСКЕ
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); // ДА
        numbers.add(3); // ДА
        numbers.add(1); // НЕТ
        numbers.add(4); // ДА
        numbers.add(5); // ДА
        numbers.add(3); // НЕТ
        numbers.add(7); // ДА
        numbers.add(9); // ДА

        HashSet<Integer> unique = new HashSet<>(numbers);
        System.out.println("В коллекции " + unique.size() + " элементов");

//        System.out.println(new HashSet<>(numbers).size());

        Iterator<Integer> iterator = unique.iterator(); // ПЕРЕБОРЩИК - ПЕРЕБИРАЕТ СОДЕРЖИМОЕ

        // НЕ ИЗМЕНЯЙТЕ КОЛЛЕККЦИЮ, ЕСЛИ СОБИРАЕТЕСЬ
        // ПОЛЬЗОВАТЬСЯ ТЕМ-ЖЕ ИТЕРАТОРОМ
        // ПОТОМУ ЧТО ПРИДЕТСЯ СОЗДАВАТЬ НОВЫЙ, ДЛЯ ОБНОВЛЕННОГО СОСТОЯНИЯ КОЛЛЕКЦИИ
        // unique.add(111);

        // 1  3  4  6

        System.out.println(iterator.hasNext() + " : " + iterator.next());
        System.out.println(iterator.hasNext() + " : " + iterator.next());
        System.out.println(iterator.hasNext() + " : " + iterator.next());
        System.out.println(iterator.hasNext() + " : " + iterator.next());
        System.out.println(iterator.hasNext() + " : " + iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
//
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());


//        System.out.println("То что получили с помощью итератора:");
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


    }
}
