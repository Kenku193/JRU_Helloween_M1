package level19_singletonSwitchEnum.enumeration;

public class App3 {
    public static void main(String[] args) {

        Car bmw = new Car("BMW", 300.0, Colors.GREEN);
        Car tesla = new Car("Tesla", 1000.0, Colors.WHITE);
        Car vw = new Car("VW", 1000000.0, Colors.RED);

        Colors[] coloredColors = Colors.getColoredColors();
        for (Colors coloredColor : coloredColors) {
            System.out.println(coloredColor);
        }


    }
}
