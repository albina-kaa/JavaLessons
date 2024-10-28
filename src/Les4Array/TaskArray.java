package Les4Array;

import java.util.Arrays;

public class TaskArray {
    public static void main(String[] args) {
        //taskFirst();
        // taskSecond();
        //  taskThird();
        // taskFourth();
       // taskFifth();
        // taskSixth();
        taskSeventh();

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


}
