package level08_functions;

public class Example7 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myMethodForMyclass(myClass);

        myMethodForString("Dima");
    }

    public static void myMethodForString(String s){
        System.out.println(s);
    }

    public static void myMethodForMyclass(MyClass s){
        System.out.println(s);
    }
}

class MyClass{
}