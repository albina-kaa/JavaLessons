package Second_Lesson;

import org.w3c.dom.ls.LSOutput;

public class Lesson2 {
    public static void main(String[] args) {
        /*long apple = 2147483648L;
        int people = 3;
        long result = apple / people;
        float berry = 3.2F ;

        System.out.println(result);*/


        /*TASK # 1
        Необходимо создать целочисленные переменные a и b, присвоить произвольные значения
        переменным на ваш выбор и вывести результаты следующих операций с этими переменными:
        сложение, умножение, вычитание, деление.*/

        int a = 100;
        int b = 50;
        int c = a + b;
        int m = a - b;
        int f = a / b;
        int e = a * b;
        System.out.println("Результат сложения чисел 100 и 50  равен " + c);
        System.out.println("Результат вычитания чисел 100 и 50 равен " + m);
        System.out.println("Результат деления чисел 100 и 500 равен " + f);
        System.out.println("Результат вычитания чисел 100 и 50 равен " + e);
        System.out.println(String.valueOf(c) +  "\n" + String.valueOf(b));


        /*TASK # 2
        Также вывести остаток от деления и сделать проверку на четность этих переменных.
         */

        int ost = a % b;
        System.out.println(a % 2);
        System.out.println(b % 2);
        System.out.println("Остаток от деления a и b равен " + ost);


        /*TASK # 3
        Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
         */

        char gc = '\u263A';
        System.out.println(gc);
        System.out.println("\uD83D\uDE00");


    }
}



