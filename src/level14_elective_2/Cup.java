package level14_elective_2;

public class Cup {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Чашка исчезает навсегда");
    }

    Spoon spoon;

    public Cup(Spoon spoon) {
        this.spoon = spoon;
    }
}
