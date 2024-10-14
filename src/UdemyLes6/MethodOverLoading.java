package UdemyLes6;
/*
Rules of Overloading

Return type

 */


public class MethodOverLoading {

    /*void showInt(int i1){
        System.out.println(i1);
    }

    void showBoolean( boolean b1){
        System.out.println(b1);
    }

    void showString(String s1){
        System.out.println(s1);
    }*/


    void show (int i1){
        System.out.println(i1);
    }

    void show (boolean b1){
        System.out.println(b1);
    }

    void show (String s1){
        System.out.println(s1);
    }

    void show(String s, int a){
        System.out.println("String:  " + s + " " + "int: "+ a);
    }

    void show(int a, String s){
        System.out.println("It's a beautiful day!");
    }
}

class MethodOverLoadingTest{
    public static void main(String[] args) {
        MethodOverLoading mO = new MethodOverLoading();
        int a = 400;
        boolean b = true;
        String s = "Hello!";

        mO.show(a);
        mO.show(b);
        mO.show(s);
        mO.show("hello", 12);
        mO.show(21, "Hello");


      /*  mO.showInt(a);
        mO.showBoolean(b);
         mO.showString(s);*/

    }
}

