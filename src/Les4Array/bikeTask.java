package Les4Array;

import java.util.Arrays;

public class bikeTask {

    public static void main(String[] args){
        /*
        июль: 15.0, 21.8, 18.9
        август: 22.8, 25.6, 25.9, 24.8, 26.8
         */


        double[] julyRides = { 15.0, 21.8, 20.5,  18.9};

        System.out.println(julyRides);
        System.out.println(Arrays.toString(julyRides));

        double total = 0;
        for (int index = 0;  index < julyRides.length; index++){
            System.out.println(julyRides[index]);
            System.out.println("ride lenght = " + julyRides[index]);
            total = total + julyRides[index];
            System.out.println("Total so far: " + total);
        }
        System.out.println("Total in July: " + total);
    }
}
