package level16_set.example1;


public class App {
    public static void main(String[] args) {

        ValueObject<Boolean> booleanValueObject = new ValueObject<Boolean>(false);

        ValueObject<Integer> integerValueObject = new ValueObject<>(10);

        ValueObject<String> stringValueObject = new ValueObject<>("s");

        ValueObject<Cat> catValueObject = new ValueObject<>(new Cat());

        ValueObject<Double> doubleValueObject = new ValueObject<>(11.9);

        // extends Object
        ValueObject valueObject = new ValueObject(new Object());

        ValueObject<Number> numberValueObject = new ValueObject<>(224.0F);
        System.out.println(numberValueObject.getValue());

    }
}
