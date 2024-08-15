package level19_singletonSwitchEnum.enumeration;

public class App1 {
    public static void main(String[] args) {

        Days d = Days.SUNDAY;
        String name = Days.SUNDAY.name();
        String nameToString = Days.SUNDAY.name().toString();
        // Мы значит название класса вывели на консоль?
        System.out.println(d);

        int ordinal = d.ordinal();
        System.out.println(ordinal);


        System.out.println(d);
        System.out.println(name);
        System.out.println(nameToString);

    }
}
