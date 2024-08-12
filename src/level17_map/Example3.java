package level17_map;

import java.util.*;

public class Example3 {

    public static void main(String[] args) {
//        Map<Integer, String> map = new TreeMap<>();
//        map.put(1, "Алексей Ольгович");
//        map.put(45, "Оксана Василисовна");
//        map.put(9, "Нарцисса Лестренджевна");
//        map.put(118, "Люциус Малфоевич");
//        map.put(76, "Юрий Александрович");
//        map.put(1987, "Лев Толстович");

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        Map<Student, Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int gradeFirst = o1.design + o1.english + o1.math;
                int gradeSecond = o2.design + o2.english + o2.math;
                return Integer.compare(gradeFirst, gradeSecond);
            }
        });

        map.put(student1, 1000);
        map.put(student2, 341);
        map.put(student3, 432234);
        map.put(student4, 10);
        map.put(student5, -1);

        System.out.println(map);

        List<Student> students = Collections.nCopies(10, student1);
        System.out.println(students);
       // students.add(new Student());
        System.out.println(students.getClass());

    }
}
