package level21_exceptions_02;

public class Tiger extends Cat {
    String fullName;

    public Tiger(String someName) {
        this.fullName = super.lastName + " " + someName;
    }

}

class E{
    public static void main(String[] args) {

        Tiger t = new Tiger("ИмяТигра");

        System.out.println(t.fullName);

    }
}