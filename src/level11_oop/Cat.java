package level11_oop;

public class Cat {

    int age;
    String name;

    public void meow() {
        System.out.println("I'm cat, MEEEOW!");
    }

    private void poo() {
        System.out.println("Я СХОДИЛ НА ГОРШОК");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
