package UdemyLes4;

public class BankAccount2 {
    int id;
    String name;
    double balance;

    public static void main(String[] args){

        BankAccount2 MyAccount = new BankAccount2();
        BankAccount2 YourAccount = new BankAccount2();
        BankAccount2 HisAccount =  new BankAccount2();

        MyAccount.id = 1;
        MyAccount.name = "Albina";
        MyAccount.balance = 212.2;

        YourAccount.id = 2;
        YourAccount.name = "Efim";
        YourAccount.balance = 234.1;

        HisAccount.id = 3;
        HisAccount.name = "Alexandr";
        HisAccount.balance = 345.2;



        System.out.println(MyAccount.id);
    }
}
