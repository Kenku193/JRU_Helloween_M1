package level11_oop;

public class Tiger extends Cat { // Тигр НАСЛЕДУЕТ Коту

    int kills;

    public void roar(){
        System.out.println("ROOOOOOAAAAR");
    }

    @Override
    public void meow() {
        System.out.println("МЯУКАЮ ПО ТИГРИНОМУ§");
    }
}
