package Les4Array;

import java.sql.Array;
import java.util.Arrays;

public class TaskArray {
    public static void main(String[] args) {
        //taskFirst();
        // taskSecond();
        //  taskThird();
        // taskFourth();
       // taskFifth();
        // taskSixth();
        //taskSeventh();
        //taskEight();
        //taskNine();
       // taskTen();
        //taskEleven();
        taskTwelve();

    }

    /**
     * 1. Создание и вывод массива
     * Задача: Создайте массив из 5 целых чисел и заполните его числами от 1 до 5.
     * Выведите элементы массива на экран.
     * Подсказка: Можно использовать цикл for для вывода всех элементов массива.
     **/

    public static void taskFirst() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    /**
     * 2. Сумма элементов массива
     * Задача: Создайте массив из 10 чисел и найдите сумму всех его элементов.
     * Подсказка: Переберите все элементы массива в цикле for и накапливайте сумму в отдельной переменной.
     */

    public static void taskSecond() {
        int[] array = {33, 21, 100, 5678, -123, 322, 10, 20, 2, 1000};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов " + sum);

    }

    /**
     * 3. Среднее значение элементов массива
     * Задача: Напишите программу, которая находит среднее значение всех элементов в массиве из 5 чисел.
     * Подсказка: Сначала найдите сумму элементов, затем разделите её на количество элементов.
     **/

    public static void taskThird() {
        int[] array = {56, 99, 200, 321, 20};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int arrSum = sum / array.length;
        System.out.println(arrSum);

    }

    /**
     * 4. Поиск максимального и минимального элемента массива
     * Задача: Создайте массив из 7 чисел и найдите максимальное и минимальное значение среди элементов.
     * Подсказка: Инициализируйте переменные max и min первым элементом массива и затем сравнивайте их с остальными элементами.
     **/

    public static void taskFourth() {

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int[] array = {66, 90, 100002, -23, 333, 3, 99112};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Минимальное значение массива = " + minValue);
        System.out.println("Максимальное значение массива = " + maxValue);

    }

    /**
     * 5. Подсчет элементов, больше заданного числа
     * Задача: Напишите программу, которая считает количество элементов в массиве, превышающих заданное число (например, 10).
     * Подсказка: Используйте цикл for и конструкцию if, чтобы сравнивать каждый элемент с заданным числом.
     **/

    public static void taskFifth() {

        int[] array = {99, 10, 12, -321, 9, 2, 23, 1, 0, -9};
        int comparisonVar = 10;
        int countAmount = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > comparisonVar) {
                countAmount += 1;
            }
        }
        System.out.println("Количество чисел больше 10 в массиве = " + countAmount);
    }

    /**
     * *6. Инверсия массива
     * Задача: Напишите программу, которая переворачивает массив, то есть меняет порядок его элементов на противоположный.
     * Подсказка: Используйте два указателя (начало и конец массива) и меняйте местами элементы в цикле,
     * пока они не встретятся в середине.
     **/

    public static void taskSixth() {
        int[] array = {99, 90, 1123, -321, 9023, 2, 23};
        int temporaryVar = 0;
        int indexSecond = array.length - 1;
        for (int index = 0; index < array.length / 2; index++) {
            temporaryVar = array[index];
            array[index] = array[indexSecond];
            array[indexSecond] = temporaryVar;
            indexSecond--;
        }
        System.out.println(Arrays.toString(array));
    }

    /**7. Количество четных и нечетных элементов
     Задача: Создайте массив из 10 случайных чисел. Подсчитайте, сколько из них четные и сколько нечетные.

     Подсказка: Проверяйте каждый элемент с помощью if (число % 2 == 0) и
     накапливайте количество четных и нечетных чиселв  отдельных переменных.
     **/
    public static void taskSeventh(){

        int[] array = {7, 22, 12, 99, 20, 3, 992, 120, 5, 90};
        int evenNum = 0; //четный
        int oddNum = 0; //нечетный

        for(int index = 0;  index < array.length; index++){
            if(array[index] % 2 == 0 ){
                evenNum+=1;
            } else {
                oddNum+=1;
            }
        }
        System.out.println("Количество четных = " + evenNum);
        System.out.println("Количество нечетных = " + oddNum);

    }

    /**
     * 8. Копирование массива
     * Задача: Создайте массив из 5 чисел и скопируйте его в другой массив.
     * Подсказка: Можно использовать цикл для копирования элементов или воспользоваться методом System.arraycopy.
     **/

    public static void taskEight(){
        int[] array = {3, 45, 12, 9, 3};
        int length = array.length;;
        int[] array2 = new int[length];
        for(int i = 0; i < array.length; i++){
            array2[i] = array[i];
        }
        System.out.println(Arrays.toString(array2));
    }

    /**
     * 9. Сдвиг элементов массива вправо
     * Задача: Напишите программу, которая сдвигает все элементы массива на одну позицию вправо. Последний элемент при этом становится первым.
     *
     * Подсказка: Сохраните последний элемент во временную переменную, а затем сдвигайте все остальные элементы.
     **/

    public static void taskNine(){
        int[] array = {65, 8, 11, 9, 55, 10};
        int lastElement =  array[array.length - 1];
        for(int index = array.length-1; index > 0; index--){
            array[index] = array[index-1];

        }
        array[0]= lastElement;

        System.out.println(Arrays.toString(array));
    }

    /**
     * 10. Удаление элемента из массива
     * Задача: Напишите программу, которая удаляет элемент массива по указанному индексу.
     * Массив должен стать короче на один элемент.
     *
     * Подсказка: Скопируйте все элементы, кроме удаляемого, в новый массив.
     * В Java массивы фиксированной длины, поэтому создается новый массив меньшего размера.
     **/
    public static void taskTen(){
        int[] array = {12, 112, 212, 312, 412, 512};
        int[] array2 = new int[array.length-1];
        int numberElement = 3;
        for( int i = 0; i < numberElement; i++){
            array2[i]= array[i];
        }
        for( int i = numberElement+1; i < array.length; i++){
            array2[i-1]= array[i];
        }


        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array));
    }

    /**
     * 11. Поиск заданного элемента в массиве
     * Задача: Напишите программу, которая ищет заданное число в массиве и возвращает его индекс.
     * Если число не найдено, вывести -1.
     *
     * Подсказка: Используйте цикл for и проверяйте, совпадает ли каждый элемент с искомым значением.
     **/

    public static void taskEleven(){

        int[] array = {21, 22, 77, 9, 12, 21, 77, 9,3,1};
        int number = 21;
         for(int i = 0; i < array.length; i++){
             if(array[i] == number){
                 System.out.println(i);
             } else{
                 System.out.println(-1);
             }
         }
    }


    /**
     * 12. Проверка массива на палиндром
     * Задача: Проверьте, является ли массив чисел "палиндромом",
     * то есть одинаково ли он читается в прямом и обратном порядке.
     *
     * Подсказка: Используйте два указателя (начало и конец массива) и сравнивайте соответствующие элементы,
     * пока они не встретятся.
     **/

    public static void taskTwelve(){

        int[] array = {1,2, 6, 4 , 4, 3, 2, 1};
        int j = array.length-1;
        boolean pal = false;
        for(int i = 0; i < array.length/2;i++){
            if(array[i]==array[j]){
                pal = true;
            } else{
                pal = false;
                break;
            }
            j--;
        }

       if(pal==true){
            System.out.println("Массив палиндром");
        } else{
            System.out.println("Не палиндром");
        }
        


    }


}
