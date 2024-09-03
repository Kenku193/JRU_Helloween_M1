package level25_dateTime_elective.elective;

public class Dog {
    private String name;
    private String poroda;
    private int age;

    public Dog() {
        name = "Шарик";
        poroda = "Овчарка";
        age = 2;
        System.out.println("Конструктор: " + name + " " + poroda + " " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Application {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setAge(10);

    }
}
