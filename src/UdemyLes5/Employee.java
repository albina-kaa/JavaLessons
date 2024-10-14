package UdemyLes5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    double increaseSalary(){
        salary *= 2;
        return salary;
    }

}
