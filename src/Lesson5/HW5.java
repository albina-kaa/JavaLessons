package Lesson5;

public class HW5 {
    public static void main(String[] args){

        /*
        _____________  Задача №1 __________
         Дан массив:
     int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     необходимо вывести сумму всех значений массива.*/

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Сумма значений массива array: " + sum);

     /*
     _____________Задача №2___________
    необходимо вывести максимальное значение массива.*/
     int min = Integer.MIN_VALUE;
     for (int i = 0; i < array.length; i++){
         if (array[i] > min){
             min = array[i];
         }
     }
     System.out.println("Максимальное значение массива array: " + min);


        /*  Задача №3

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.*/


        int max = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if (array[i] < max){
                max = array[i];
            }
        }
        System.out.println("Минимальное значение массива array: " + max);



/*Задача №4
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.*/
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        double sum1 = 0;
        int a = array3.length;
        for (int i = 0; i < array3.length; i++){
            sum1+=array3[i];
        }
        System.out.println("Среднее арифметическое значений массива array:");
        System.out.println(a);
        System.out.println(sum1);

        System.out.println(sum1 / a);




/*Задача №5

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.*/

      int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

      double sum2 = 0;
      for (int i = 0; i < array2.length; i++){
          for(int j = 0; j < array2[i].length; j++){
              sum2+=array2[i][j];
          }
      }
        System.out.println("Сумма значенией массива array2 = " + sum2);

/*Задача №6

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.*/

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++) {  //перебор массивов массивов внутри массива
            for (int j = 0; j < array2[i].length; j++) { //перебор элементов внутри массивов
                if (array2[i][j] > max2) {
                    max2 = array2[i][j];
                }
            }
        }
        System.out.println("Минимальное значение массива array2 = " + max2);



/*Задача №7

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.*/


        int count = 0;
        for (int i = 0; i < array2.length; i++) {  //перебор массивов массивов внутри массива
            for (int j = 0; j < array2[i].length; j++) {
                count++; //количество итераций
            }
        }
        System.out.println(count);



    }
}
