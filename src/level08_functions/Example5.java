package level08_functions;

public class Example5 {
    public static void main(String[] args) {
        String s = "Иван";
        int i = 10;
        prnt(s, i*10);
    }

    // ПЕРЕДАЧА ПРОИСХОДИТ ПО ЗНАЧЕНИЮ!!!
    // ЕСЛИ С ПРИМИТИВОМ ВСЕ ОК - МЫ СРАЗУ ПОНИМАЕМ ЧТО ЭТО ЧИСЛО 10
    // ТО СО ССЫЛОЧНЫМ ТИПОМ - ЗНАЧЕНИЕМ ЯВЛЯЕТСЯ ССЛЫКА!!!
    public static void prnt(String s, int i){
        for (int j = 0; j < i; j++) {
            System.out.println(s);
        }
    }
}
