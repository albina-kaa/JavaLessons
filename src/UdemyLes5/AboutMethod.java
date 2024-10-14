package UdemyLes5;

        /*
        Метод отображает поведние класса, его состояние. То же самое что и функция
        Метод  обрабатывает переменные и производит, какие-то действия

        Структура метода на примере

        public static void main(String [] args) {our code}
 public - access modifier (есть не вовсех  методах)
 static - non-access modifier (есть не во всех  методах)
 void- return type (То что возвращает метод)
 main - имя метода
 (String [] args) - параметры, обязательная часть метода, может быть несколько
 или вообще не быть,  то тогда () не оставляются пустыми
 {our code } - body, описывает функциональность метода


         */


public class AboutMethod {
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    /*
    return type int ( Возвращается )
    summa - название метода
    (int a, int b, int c) - параметры
     */
    
    int sredneArifm(int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1) / 3;
        return result2;
    }
}


 class  Test21{
     public static void main(String[] args){
         AboutMethod t = new AboutMethod();
         int summsTrexChisel = t.summa(1,2,3);
         t.summa(342,321, 0);
         System.out.println(summsTrexChisel);
         System.out.println(t.summa(5,10,15));
         System.out.println(t.sredneArifm(20,40,60));
     }
 }








