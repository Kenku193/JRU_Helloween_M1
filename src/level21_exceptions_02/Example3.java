package level21_exceptions_02;

import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Stack;

public class Example3 {
    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(111);
        integerStack.push(222);
        integerStack.push(333);
        integerStack.push(444);
        System.out.println(integerStack);

        // ВЗЯТЬ ИЗ СТОПЫ 2 ЭЛЕМЕНТА
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
       // System.out.println(integerStack.pop());
        System.out.println(integerStack);

        // ПОСМОТРЕТЬ ЧТО ЛЕЖИТ НАВЕРХУ
        try {
            System.out.println(integerStack.peek());
        }
        catch (EmptyStackException ese){
            System.out.println("В стеке пусто!");
        }

        System.out.println(integerStack.empty());
        // hasNext -> УДОСТОВЕРИТЬСЯ, ЧТО ДАЛЬШЕ ЧТО-ТО ЕСТЬ

        integerStack.push(999);
        int searchedIndex = integerStack.search(999);
        System.out.println("Index of element: " + searchedIndex);

        Integer gettedByIndexFromStack = integerStack.get(searchedIndex - 1);
        System.out.println(gettedByIndexFromStack);

    }
}
