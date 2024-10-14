package Lesson3;

public class Les3_if_else {
    public static void main(String[] args){

        int totalOranges = 10;
        int forCheburashka = 5;

        if (forCheburashka*2 > totalOranges){
            System.out.println("какой жадный Чебурашка!");
        }

        System.out.println("ВсЕ!");

        if (forCheburashka*2 > totalOranges){
            System.out.println("Жадный Чебурашка!");
        } else {
            System.out.println("Чебурашка молодец!");
        }

        int forGena = totalOranges - forCheburashka;
        if (forCheburashka> forGena){
            System.out.println("Какой жадный чебурашка");
        } else if (forGena > forCheburashka){
            System.out.println("Гена обнаглел");
        } else {
            System.out.println("Оба молодцы");
        }
        System.out.println("The end");




    }
}
