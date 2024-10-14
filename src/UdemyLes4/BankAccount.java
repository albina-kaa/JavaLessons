package UdemyLes4;

public class BankAccount {

    int id;
    String name;
    double balance;

    void snyztieSoSheta(double withdraw){
        balance-=withdraw;
    }

    double PopolnenieSheta(double addition){
        balance+=addition;
        return balance;
    }

    public static void main(String[] args){


    /*
    Примитивные и ссылочные типы данных
Примитивный тип данных содержит сам объект
    int a = 10; (Целочисленная переменная со значением  10
Ссылочные типы данных содержат ссылку на объект
Переменная BankAccount bA (Класс тоже объект)
содержит указатель на объект Public class BAnkAccount
со значением
 int id = 1;
 String name;
 double balance;
         */

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Albina";
        MyAccount.balance = 13.12;
        MyAccount.PopolnenieSheta(21);
        MyAccount.snyztieSoSheta(2.2);
        System.out.println("Имя: "+MyAccount.name +" Баланс: " + MyAccount.balance);

        YourAccount.id = 2;
        YourAccount.name = "Sasha";
        YourAccount.balance = 43.21;

        HisAccount.id = 3;
        HisAccount.name = "Efim";
        HisAccount.balance = 22;


    }
}
