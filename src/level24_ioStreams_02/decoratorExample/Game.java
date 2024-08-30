package level24_ioStreams_02.decoratorExample;

public class Game {
    public static void main(String[] args) {

        Unit[] units = {
                new Magician(new Knight()),
                new Magician(new Elf(new Ork())),
                new Ork(),
                new Elf(new Knight())
        };

        for (Unit unit : units) {
            unit.go();
        }


    }
}
