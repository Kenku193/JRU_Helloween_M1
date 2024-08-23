package level21_exceptions_02;

import java.util.Stack;

public class Example2 {
    public static void main(String[] args) {

        method4();

    }

    static void method1(){
        System.out.println("Текст");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.out.println(stackTraceElement);
        }
    }
    static void method2(){
        method1();
    }
    static void method3(){
        method2();
    }
    static void method4(){
        method3();
    }

}
