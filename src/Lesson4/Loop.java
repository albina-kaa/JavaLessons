package Lesson4;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Loop {
    public static void main(String[] args) {
/*
          for (int i = 0; i < 5; i = i+1) {
              System.out.println(i);

        }
        System.out.println("end");

          int a = 1;
          while (a < 5) {
              System.out.println(a);
              a = a+1;

        }

        int[] arr = {10, 20, 30};

        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println("End");

        for (int i =0; i < arr.length; i = i+1){
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
        arr[0]= 12;
        System.out.println(Arrays.toString(arr));

        int[] first = new int[100];
        for (int i = 0; i < first.length; i = i+1){
            first[i]= i*10;
        }
        System.out.println(Arrays.toString(first));*/

        //Task #1 Необходимо вывести числа от 0 до 15.
        System.out.println("Task #1");

        for (int i = 0; i <= 15; i+= 1) {
            System.out.println(i);
        }
        System.out.println("Task #2");

        //Task #2 Необходимо вывести все положительные степени числа 5 которые меньше 10000,
        // вывести результат возведения в степень.
/*
        int maxLimit = 10000;
        int value = 5;
        int result = 5;
        for (int i = 0; i < 100; i += 1) {
            result = result * value;
            if (result < maxLimit) {
                System.out.println(result);
            } else {
                return;
            }
        }*/

        for (int i = 5; i<10000; i *=5){
            System.out.println(i);
        }

        // Task #3 Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        //Реализовать 2 варианта:
        //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        //без использования конструкции if (шаг цикла на ваше усмотрение).

        System.out.println("Task #3  with if");

     for (int i =40; i<= 60; i+=1){
         if (i%4==0){
             System.out.println(i);
         }
       }

        System.out.println("Task #3  without if");

        for (int i = 40; i <= 60; i +=4) {
            System.out.println(i);
        }


        //Задача №1

        /*

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все нечетные числа из массива.

         */

        System.out.println("Task 4.1");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 !=0){
                System.out.println(array[i]);
            }

        }


             // Задача №2
        /*

        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести все значения массива больше 5.

         */
        System.out.println("Task 4.2");


        for (int i = 0; i < array.length; i++){
            if (array[i] >5){
                System.out.println(array[i]);
            }

        }

        // Задача №3

       /* Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо увеличить все значения массива на 15.
        */


        System.out.println("Task 4.3");
        for (int i = 0; i < array.length; i+=1){
            array[i] = array[i]+15;
            System.out.println(array[i]);
        }



    }
}

