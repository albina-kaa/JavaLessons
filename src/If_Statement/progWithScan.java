package If_Statement;
import java.util.Scanner;

class progWithScan {
    public static void main(String[] args) {
        while (true) {
            calculateSimpleNumber();

        }
    }

    /**
     Задание: Напишите программу, которая проверяет, является ли число простым. Число называется простым, если оно делится только на себя и на 1.
     Подсказка:
     Введите число, которое нужно проверить.
     Используйте цикл for для проверки, делится ли число на другие числа (от 2 до этого числа минус 1).
     Если оно делится хотя бы на одно число без остатка, то оно не является простым.
     1) Операция ввода-вывода
     2) Проверка на простоту введенного числа
     **/
    static void calculateSimpleNumber() {
        int number = 0;
        var scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            throw new ArithmeticException("Error! Is not number!");
        }

        boolean isSimple = isSimple(number);
        if (isSimple == true){
            System.out.println( number + " простое числое");
        } else {
            System.out.println(number + " число  не простое");
        }
    }
    static boolean isSimple(int number){
        boolean simple = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            } else {
                simple = true;
            }
        }
        return simple;
    }
}
