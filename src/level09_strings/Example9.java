package level09_strings;

import java.util.Arrays;

public class Example9 {
    public static void main(String[] args) {

        String str1 = " ";
        System.out.println(str1.length());
        System.out.println(str1.isEmpty()); // ?
        System.out.println(str1.isBlank()); // ?

        String str2 = "JavaRush";
        char c = str2.charAt(3);
        System.out.println(c);
        char[] chars = str2.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        byte[] str2Bytes = str2.getBytes();
        System.out.println(Arrays.toString(str2Bytes));

        char c1 = 0x2691;
        char v1 = '\u2691';
        char b1 = '⚑';
        System.out.println(c1);

        System.out.println("split example");
        String myString = "Hello, i'm JR student!";
        String[] s = myString.split(" ");
        for (String s1 : s) {
            System.out.println(s1);
        }

        System.out.println("join example");
        String join = String.join(" ", "первая строка", "вторая строка", "третья строка", "четвертая строка");
        System.out.println(join);
    }
}
