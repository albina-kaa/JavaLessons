package If_Statement;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args){
       // Multiplication();
        //SumOfMultiplication3_5();
        InputNumber();

    }
    /**
     Задача 5: Сумма чисел кратных 3 и 5
     Задание: Напишите программу, которая выводит сумму всех чисел от 1 до 100, которые делятся на 3 или на 5.
     Подсказка:
     Используйте цикл for для перебора чисел от 1 до 100.
     Внутри цикла используйте if для проверки делимости числа на 3 или 5, и добавляйте это число к общей сумме.
     **/
    private static void SumOfMultiplication3_5(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма чисел кратных 3 и 5 равна " + sum);
    }

    /**
        Задача 4: Таблица умножения
        Задание: Напишите программу, которая выводит таблицу умножения для чисел от 1 до 10.
        Подсказка:
        Используйте вложенные циклы for.
        Внешний цикл — для чисел от 1 до 10.
        Вложенный цикл — для вывода результатов умножения на числа от 1 до 10.

     1)
     2)
     **/
    private static void Multiplication(){

        for(int i = 1; i < 11; i++){
            System.out.println();
            for (int j = 1; j < 11; j++){
                System.out.print(i + " * " + j + " = " + i * j + "  ");

            }

        }
    }

    /**
     Задача 6: Факториал числа
     Задание: Напишите программу, которая вычисляет факториал числа. Факториал числа n — это произведение всех чисел от 1 до n (обозначается как n!).
     Подсказка:
     Используйте цикл for для вычисления произведения чисел.
     Вводите число через консоль.
     **/
    private static void InputNumber(){
        int number = 0;
        var scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        if (scanner.hasNextInt()) {
        number = scanner.nextInt();
    } else {
        throw new ArithmeticException("Error! Is not number!");
    }
        int factor = 1;
        for(int i =1; i <= number; i++){
            factor *= i;
        }

        System.out.println("Факториал " + number + " = " + factor);

    }





    }



