package level24_ioStreams_02.decoratorExample;

public class Elf extends AbstractUnit{

    public Elf(Unit unit) {
        super(unit);
    }

    @Override
    protected void loudScream() {
        System.out.println("ГДЕ МОИ ПОДВЕСКИ!!!!???");
    }
}
