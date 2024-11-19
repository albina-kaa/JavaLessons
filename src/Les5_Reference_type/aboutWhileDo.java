package Les5_Reference_type;

public class aboutWhileDo {
    public static void main(String[] args){

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1;
        arr2[0] = -1;

        //Массив - reference type
        // Атрибуты ссылочных типов данных

        String str = "Hello world!";
        System.out.println(str.contains("Hello"));
        System.out.println(str.length());
        System.out.println(str.charAt(6));

        /*for( int i = 0; i <str.length(); i++){
            System.out.println(str.charAt(i));
        }*/

        for(int i =0; i < str.length(); i++){
            if (str.charAt(i) == 'w'){
                System.out.println("index of w is " + i);
            }
        }

        System.out.println(str.indexOf('s'));

        System.out.println(str.replaceFirst("l", "-"));

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'l'){
                count++;
            }
        }
        System.out.println(count);





    }
}
