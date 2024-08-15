package level19_singletonSwitchEnum.enumeration;

public enum Colors {
    RED,
    GREEN,
    BLUE,
    WHITE;

    public static Colors[] getColoredColors() {
        Colors[] coloredColors = {RED, GREEN, BLUE};
     return coloredColors;
    }

    public static Colors[] getBlankColors() {
        Colors[] coloredColors = {WHITE};
        return coloredColors;
    }


}
