package level21_exceptions_02.example1;

import level21_exceptions_02.example1.exceptions.AnotherException;
import level21_exceptions_02.example1.exceptions.FireException;

import java.util.Arrays;

public class PlasticWorkshop {

//    static void makePlasticThing() throws AnotherException {
//        throw new AnotherException("Непроверяемое ислкючение!");
//    }


    // ЗДЕСЬ У МЕНЯ ВСЕГДА РАБОЧИЙ КОТОРЫЙ БЕДОКУРИТ
   private static void makeTazik() throws FireException {
        // КАКАЯ-ТО РАБОТА, КОТОРАЯ ВСЕГДА ЗАКАНЧИВАЕТСЯ...
        throw new FireException("Пожар! Всем покинуть цех!");
    }

    static void doWork() throws FireException {
//       try {
           makeTazik();
//       }
//       catch (FireException fe){
//           StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
//           for (StackTraceElement stackTraceElement : stackTrace) {
//               System.out.println(stackTraceElement);
//           }
//       }

    }

}
