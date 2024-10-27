package Les4Array;

import java.time.chrono.MinguoChronology;
import java.util.Arrays;
import java.util.Collections;

public class homeWorkTask {
    public static void main(String[] args) {
        // task1();
        // task2();
        //task3();
         task4();
        //task7FromGPT();
        //task8FromGPT();
    }

    /**
     * Задача №1
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести все нечетные числа из массива.
     **/

    public static void task1() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                System.out.println(array[index]);
            }
        }
    }

    /**
     * Задача №2
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести все значения массива больше 5.
     **/

    public static void task2() {
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] > 5) {
                System.out.println(array1[index]);
            }
        }

    }

    /**
     * Задача №3
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо увеличить все значения массива на 15
     **/
    public static void task3() {
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int index = 0; index < array2.length; index++) {
            array2[index] += 15;
        }
        System.out.println(Arrays.toString(array2));
    }

    /**
`     * Задача со звездочкой
     * Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
     * Необходимо изменить порядок элементов массива на противоположный (т.е. чтобы получилось { 10, 9, …, 2, 1 } ).
     * Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.
     **/
    public static void task4() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int bufer = 0;
        int rideIndex = array.length-1;

        for (int index = 0; index < (array.length / 2); index++) {
           bufer = array[index];
           array[index] = array[rideIndex];
           array[rideIndex] = bufer;
           rideIndex--;

        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * Задача 7: Поиск максимального и минимального числа
     * Задание: Напишите программу, которая находит максимальное и минимальное число в массиве чисел.
     * Подсказка:
     * Создайте массив чисел.
     * Используйте цикл for для прохода по элементам массива.
     * Внутри цикла используйте if для проверки, больше ли текущее число максимального и меньше ли оно минимального.
     **/
    public static void task7FromGPT() {
        int[] array4 = {22, 45, 87, 99, 7283, 33332, -122};
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        //Поиск максимального значения

        for (int index = 0; index < array4.length; index++) {
            if (array4[index] > maxValue) {
                maxValue = array4[index];
            }
            if (array4[index] < minValue) {
                minValue = array4[index];
            }
        }
        System.out.println(" Max value is " + maxValue);


        //Поиск минимального значения
        for (int index = 0; index < array4.length; index++) {

        }
        System.out.println("Min value is " + minValue);

    }

    /**
     * Задача 8: FizzBuzz
     * Задание: Напишите программу, которая выводит числа от 1 до 100. Однако для чисел, кратных 3,
     * программа должна выводить "Fizz", для чисел, кратных 5 — "Buzz".
     * Для чисел, кратных и 3, и 5, программа должна выводить "FizzBuzz".
     * Подсказка:
     * Используйте цикл for для перебора чисел.
     * Используйте вложенные условия if-else для проверки кратности чисел 3 и 5.
     **/
    public static void task8FromGPT() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " - Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " - Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
