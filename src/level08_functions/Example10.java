package level08_functions;

public class Example10 {

    public static void main(String[] args) {

        int i = myMethod(                   // 2000
                            myMethod(20) // 200
                        );
        System.out.println(i);

    }

    public static int myMethod(int x){
        return x * 10;
    }

}
