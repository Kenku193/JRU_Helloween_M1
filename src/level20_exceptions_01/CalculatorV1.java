package level20_exceptions_01;

public class CalculatorV1 {

    public static void main(String[] args) {

        int x = division(10, 0);
        doNothing();

    }

    static int division(int a, int b){
        int result = a / b; // СОЗДАЛОСЬ ИСКЛЮЧЕНИЕ (ЕСЛИ b=0)
        return result; // СПОСОБ ВЫХОДА ИЗ МЕТОДА
    }

    static void doNothing(){
    }
}


// начал работу метод main
// создал переменную int x
// я должен инциализировать переменную x, потому что стоит =
// перепрыгиваю в метод division и начинаю его работу
// division сработал штатно и произошел выход из него
// код вернулся в строку 7 и подставил туда результ работы division'а

