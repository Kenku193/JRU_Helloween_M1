package level16_set.example1;

public class ValueObject<T> { // Placeholder

    private T value;

    public ValueObject(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueObject{" +
                "value=" + value +
                '}';
    }
}
