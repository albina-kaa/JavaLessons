package UdemyLes4.HomeWork;
/* Structure of Java class
1. The package statement
2.  The import statement
3.  Class declaration and definitions
    - Variables (State)
    - Methods (Behavior)
    - Constructors
    - Comments
 */

class Student {
    int StudentTicket;
    String studentName;
    String studentLastname;
    int yearStudy;
    double averMath;
    double averEconomy;
    double averForeign;


}

public class StudentTest {

    static double averageRates(Student student) {
        double averRating = (student.averEconomy + student.averForeign + student.averMath) / 3;
        return averRating;
    }

    public static void main(String[] args) {
        Student ivanov = new Student();
        Student petrov = new Student();
        Student efimov = new Student();

        ivanov.StudentTicket = 12345;
        ivanov.studentLastname = "Иванов";
        ivanov.studentName = "Захар";
        ivanov.averEconomy = 4.57;
        ivanov.averForeign = 4;
        ivanov.averMath = 5;

        petrov.StudentTicket = 12345;
        petrov.studentLastname = "Петров";
        petrov.studentName = "Леонид";
        petrov.averEconomy = 4.57;
        petrov.averForeign = 4;
        petrov.averMath = 5;

        efimov.StudentTicket = 12345;
        efimov.studentLastname = "Ефимов";
        efimov.studentName = "Александр";
        efimov.averEconomy = 3.27;
        efimov.averForeign = 5.00;
        efimov.averMath = 3.89;

        double averIvanov = averageRates(ivanov);
        double averPetrov =  averageRates(petrov);
        double averEfimov =  averageRates(efimov);

        System.out.println("Средняя оценка студента " + petrov.studentLastname + "  " + petrov.studentName + " =  " + averIvanov);
        System.out.println("Средняя оценка  студента " + ivanov.studentLastname + "  " + ivanov.studentName + "  = " + averIvanov);
        System.out.println("Средняя оценка студента " + efimov.studentLastname + "  " + efimov.studentName + " =  " + averEfimov);


    }
}
