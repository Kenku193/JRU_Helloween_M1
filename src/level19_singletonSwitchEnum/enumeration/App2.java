package level19_singletonSwitchEnum.enumeration;

public class App2 {
    public static void main(String[] args) {

        Days[] values = Days.values();

        Days someValue = values[6];
        System.out.println(someValue);

        for (Days value : values) {
            System.out.println(value);
        }

        boolean equals = Days.WEDNESDAY.equals(Days.WEDNESDAY);
        System.out.println(equals);

        int hashOfWednesday = Days.WEDNESDAY.hashCode();
        int hashOfFriday = Days.FRIDAY.hashCode();
        System.out.println(hashOfWednesday);
        System.out.println(hashOfFriday);

        boolean isMondayEqWhite = Days.MONDAY.equals(Colors.WHITE);
        System.out.println(isMondayEqWhite);


    }
}
