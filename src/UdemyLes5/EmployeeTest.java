package UdemyLes5;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee();
        employee1.surname = "Vasin";
        employee1.id = 21;
        employee1.salary = 60000;
        employee1.department = "Web";
        double newSalary = employee1.increaseSalary();
        System.out.println(newSalary);


        Employee employee2 = new Employee();
        employee2.surname = "Efimov";
        employee2.id = 23;
        employee2.salary = 75000;
        employee2.department = "Web";
        double newSalary2 = employee2.increaseSalary();
        System.out.println(newSalary2);


    }
}
