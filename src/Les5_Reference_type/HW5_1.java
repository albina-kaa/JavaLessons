package Les5_Reference_type;

public class HW5_1 {
    public static void main(String[] args){
        task_1();
        task_2();
        tas_3();
        task_4();
        task_5();
        task_6();

    }

    /**
     *Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести сумму всех значений массива.
     **/

    public static void task_1(){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);

    }

    /**
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести максимальное значение массива.
     **/
    public static void task_2(){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if( array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);

    }

    /**
     * Задача №3
     *
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести минимальное значение массива.
     **/

    public static void tas_3(){
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;
        for( int i = 0;  i < array.length; i++){
            if(array[i]< min){
                min = array[i];
            }
        }
        System.out.println(min);

    }

    /**
     * Задача №4
     * Дан массив:
     * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     * необходимо вывести среднее арифметическое всех значений массива.**/

    public static void task_4(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for( int i =0; i < array.length; i++){
            sum+=array[i];
        }
        double average = sum / array.length;
        System.out.println(average);

         }

    /**
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести сумму элементов массива.
     */

    public static void task_5(){
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        for(int i = 0; i< array.length; i++){
            for( int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }

    /**
     * Задача №6
     *
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести максимальное значение массива.
     **/
    public static void task_6(){
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = Integer.MIN_VALUE;
         for( int i = 0; i < array.length; i++){
             for( int j = 0; j < array[i].length; j++){
                 if( array[i][j] > max){
                     max = array[i][j];
                 }
             }
         }
        System.out.println(max);

    }

}
