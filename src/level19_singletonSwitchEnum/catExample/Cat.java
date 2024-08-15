package level19_singletonSwitchEnum.catExample;

public class Cat {
    Cat cat1 = new Cat("Куся", 6);
    String name;
    int age;

    // ЕСЛИ КОНСТРУКТОР ПРИВАТНЫЙ, ТО СОЗДАТЬ ЭКЗЕМПЛЯР Cat
    // ВОЗМОЖНО ТОЛЬКО ВНУТРИ САМОГО КЛАССА Cat,
    // ПОТОМУ ЧТО БОЛЬШЕ НИОТКУДА ДАННЫЙ КОНСТРУКТОР ДОСТУПЕН НЕ БУДЕТ
    private Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
