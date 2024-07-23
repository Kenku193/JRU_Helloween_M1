package level11_oop.task;

public class TaskExample {
    public static void main(String[] args) {

//        Point point1 = new Point();
//        point1.x = 10;
//        point1.y = 200;
//        point1.color = 555;
//
//        Point point2 = new Point();
//        point2.x = 20;
//        point2.y = 300;
//        point2.color = 777;

        // СОЗДАЛ МАССИВ ДЛЯ БУДУЩИХ ТОЧЕК
        Point[] points = new Point[100]; // 0 - 99

        // ЗАПОЛНЯЮ МАССИВ СОЗДАВАЯ НОВЫЕ ТОЧКИ В КАЖДОЙ ИТЕРАЦИИ
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
        }

        // ЗАПОЛНЯЮ ЗНАЧЕНИЯ ПЕРЕМЕННЫХ ВНУТРИ КАЖДОЙ ТОЧКИ
        for (int i = 0; i < points.length; i++) {
            points[i].color = i;
            points[i].x = i;
            points[i].y = i;
        }

        // ВЫВОЖУ ЗАНЧЕНИЯ ПЕРЕМЕННЫХ КАЖДОЙ ТОЧКИ
        for (int i = 0; i < points.length; i++)
            System.out.println("Цвет точки x=" + points[i].x + ", y=" + points[i].y + " " + points[i].color);
    }

    }
