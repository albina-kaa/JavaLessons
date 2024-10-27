package Les4Array;

import java.util.Arrays;

public class TaskArray {
    public static void main(String[] args){
       //taskFirst();
       // taskSecond();
        taskThird();

    }
    /**
     * 1. Создание и вывод массива
     *Задача: Создайте массив из 5 целых чисел и заполните его числами от 1 до 5.
     *Выведите элементы массива на экран.
     *Подсказка: Можно использовать цикл for для вывода всех элементов массива.**/

     public static void taskFirst(){
         int[] array = {1, 2, 3, 4, 5};
          for(int i = 0; i < array.length; i++){
              System.out.println(array[i]);
          }

    }

    /**
     * 2. Сумма элементов массива
     * Задача: Создайте массив из 10 чисел и найдите сумму всех его элементов.
     *Подсказка: Переберите все элементы массива в цикле for и накапливайте сумму в отдельной переменной.
     */

    public static void taskSecond(){
        int[] array = {33, 21, 100, 5678, -123, 322, 10, 20, 2, 1000};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Сумма элементов " + sum);

    }

    /**
     * 3. Среднее значение элементов массива
     * Задача: Напишите программу, которая находит среднее значение всех элементов в массиве из 5 чисел.
     * Подсказка: Сначала найдите сумму элементов, затем разделите её на количество элементов.
     **/

    public static void taskThird(){
        int[] array = {56, 99, 200, 321, 20};
        int sum = 0;
        for( int i = 0; i < array.length; i++){
            sum += array[i];
        }
        int arrSum = sum / array.length;
        System.out.println(arrSum);

    }



}
