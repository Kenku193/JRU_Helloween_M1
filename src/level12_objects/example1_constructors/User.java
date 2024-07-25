package level12_objects.example1_constructors;

public class User extends Object {

    private int id = 0; // 0
    private String login = "loginDeafult"; // null
    private String password = "passwordDefalut"; // null

    private long hash;

    public User(){
        System.out.println("В данный момент создается новый пользователь!");
        id = 10;
        login = "unknownLogin";
        password = "unknownPassword";
        System.out.println("Новый пользователь успешно создан");
    }

    public User(String l, String p){
        this.id = 999;
        this.login = l;
        this.password = p;
    }

    public User(int id, String login, String password){
        // НЕ РАБОТАЕТ! ПОЧЕМУ?
//        id = id;
//        login = login;
//        password = password;

        // А ТАК РАБОТАЕТ
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public void myMethod(){
        System.out.println("Привет! Я метоооод!");
    }

    @Override // ПЕРЕОПРЕДЕЛЕН - ТО ЕСТЬ ЗАКРЫЛ СОБОЙ МЕТОД ИЗ КЛАССА РОДИТЕЛЯ
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
