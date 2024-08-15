package level19_singletonSwitchEnum.singleton;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {
    }
    String value = "Это синглтон";

    public static Singleton getInstance(){
        return INSTANCE;
    }

}
