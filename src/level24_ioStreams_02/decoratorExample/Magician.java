package level24_ioStreams_02.decoratorExample;

public class Magician extends AbstractUnit{

    public Magician(Unit unit) {
        super(unit);
    }

    @Override
    protected void loudScream() {
        System.out.println("БЕГИЕ, ГЛУПЦЫ!!!");
    }
}
