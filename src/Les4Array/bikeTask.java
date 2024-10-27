package Les4Array;

import java.util.Arrays;

public class bikeTask {

    public static void main(String[] args) {
        /*
        июль: 15.0, 21.8, 18.9
        август: 22.8, 25.6, 25.9, 24.8, 26.8
         */


//        double[] julyRides = {15.0, 21.8, 20.5, 18.9};
//
//        System.out.println(julyRides);
//        System.out.println(Arrays.toString(julyRides));
//
//        double total = 0;
//        for (int index = 0; index < julyRides.length; index++) {
//            System.out.println(julyRides[index]);
//            System.out.println("ride lenght = " + julyRides[index]);
//            total = total + julyRides[index];
//            System.out.println("Total so far: " + total);
//        }
//
//        for (int index = 0; index < julyRides.length; index++) {
//            System.out.println("index = " + index);
//            System.out.println("ride length = " + julyRides[index]);
//
//        }
//
//        System.out.println("Total in July: " + total);
//
//
//        int[] empty15 = new int[15];
//        System.out.println(empty15.length);
//

        //Поиск минимального значения
        double[] augustRide = {25.5, 25.9, 26.8, 22.8, 24.8, 30.5};
        System.out.println(augustRide.length);

        double min = Double.MAX_VALUE;
        for (int index = 0; index < augustRide.length; index++) {
            if (augustRide[index] < min) {
                min = augustRide[index];
            }
        }
        System.out.println("Shortest ride was " + min);

        //Поиск максимального значения
        double max = Double.MIN_VALUE;
        for (int index = 0; index < augustRide.length; index++) {
            if (augustRide[index] > max) {
                max = augustRide[index];
            }
        }
        System.out.println("Longest ride was " + max);

        double[][] allRides = {
                {15.0, 21.8, 20.5, 18.9},
                {25.5, 25.9, 26.8, 22.8, 24.8, 30.5}
        };

        System.out.println(Arrays.toString(allRides[0]));
        System.out.println(allRides[0][3]);

        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < allRides.length; i++){
            for (int j = 0; j <  allRides[i].length; j++){
                if (allRides[i][j] > maxValue){
                    maxValue = allRides[i][j];
                }
            }
        }

        System.out.println(maxValue);



    }
}
