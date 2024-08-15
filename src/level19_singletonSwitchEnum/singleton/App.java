package level19_singletonSwitchEnum.singleton;

public class App {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        System.out.println(s.value);

    }
}
class Bpp {
    public static void main(String[] args) {
        Singleton sngltn = Singleton.getInstance();
    }
}
