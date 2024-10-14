package UdemyLes5;
 class Human{
     String name;
     Car3 car;
     BankAccount bA;
     void info(){
         System.out.println("Имя: " + name + " цвет машины: " + car.color + " Баланс банковского счета: " + bA.balance);
     }

 }

 class Car3{
     Car3(String c, String e){
         color=c;
         engine = e;
     }
     String color;
     String engine;
 }

 class BankAccount{

     BankAccount(int id2, double balance2){
         id = id2;
         balance = balance2;
     }
     int id;
     double balance;

 }



public class AboutConstructor {
    public static void main(String[] args){

        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "V8");
        h.bA = new BankAccount(15, 542.3);
        h.info();






        /*
        name of constructor = mane of class (Контструктор всегда называется также как и класс)

        Car car1 = new Car();
        new Car() - создает в памяти объект Car c со значениями
        car1 - создлает связь переменной с обхектом


        Типы конструкторов
        1. Default (Создается компилятором, если не создан пользовательский коструктор; всегда без параметров;
        Тело всегда пустое)
        2. User defined (Создается пользователем; Параметры могут быть или не быть, Тело может быть заполнено или не заполнено)

        Разница между коструктором и методом

       1. Метод ВСЕГДА имеет RETURN TYPE ( если его нет,  то обязателено void)
        Конструктор НИКОГДА не имеет RETURN TYPE

       2. Метод может иметь практически любое название
       Имя Конструктора должно совпадать с именем класса

         */
    }
}
