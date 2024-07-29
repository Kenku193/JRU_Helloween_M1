package level13_classesAndStatic.example3;

public class ImageAtDisplay {

    static Pixel[][] pixels;

    public static void main(String[] args) {

        pixels = new Pixel[1024][768];

        pixels[0][0].color = 50;
        pixels[0][0].brightness = 100;

    }

    private class Pixel {
        int color; // hex
        int brightness; // dec
    }

}
