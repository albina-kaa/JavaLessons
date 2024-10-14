package Lesson5;

public class Les_5 {
    public static void main(String[] args){
        int[] arr = {1, 5, 8, 3, 6, 9};

        int max= 0;

        for (int i = 0; i < arr.length; i=i+1){
            if (arr[i] > max){
                max = arr[i];

            }
        }
        System.out.println(max);

        int min= Integer.MAX_VALUE; //минимальное число значения integer

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > min){
                min = arr[i];

            }
        }
        System.out.println(min);

        int sum = 0;
        for (int i=0; i < arr.length; i++){
            sum += arr[i]; //sum = sum+arr[i]
        }
        System.out.println(sum);

        int[][] arr2 = {
                {1,99,21,3},
                {22, 323, 98, 21},
                {0, 12, 21,33, 111, 223}
        };

        for (int i = 0; i < arr2.length; i++){  //перебор массивов массивов внутри массива
            for (int j = 0; j < arr2[i].length; j++){ //перебор элементов внутри массивов
                if (arr2[i] [j] > max){
                    max = arr2[i][j];
                }

            }
        }
        System.out.println(max);







    }
}
