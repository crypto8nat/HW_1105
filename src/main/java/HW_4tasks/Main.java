package HW_4tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task 1
//        Введите 2 слова с клавиатуры (используя объект класса Scanner),
//        состоящие из четного количества букв. Выведите в консоль слово,
//        состоящее из первой половины первого слова и второй половины второго слова.

                System.out.println("Введите 2 слова с клавиатуры,состоящие из четного количества букв.");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String word1 = scanner.nextLine();
        System.out.println("Вы ввели слово:" + word);
        System.out.println("Вы ввели слово:" + word1 );


        int w = word.length() / 2;
        int w1 =word1.length() /2;

        String result = word.substring(0, w) + word1.substring(w1);

        System.out.println(result);
//        _______________________
//        Task2
//        Напишите программу, которая выводит на экран результаты сложения,
//        вычитания, умножения и деления двух чисел.

      calculate();

//      _______________________
//          Task3
//     Напишите метод, который конвертирует указанную сумму в евро в сумму в долларах США.

       double dollar =  converter(0.92);
        System.out.println(dollar + " $ ");
//        __________________________
//        Task4
//       Напишите программу, которая подсчитает, сколько дополнительных калорий будет,
//       если вы купите пиццу диаметром 28 см вместо пиццы диаметром 24 см.
//       Будем считать, что в каждом квадратном сантиметре пиццы содержится 40 калорий

        int d1 = 28;
        int d2 = 24;
        int calMeter = 40;

        double calories = calories(d1, d2, calMeter);

        System.out.println(calories + " cal");
    }
       public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1");
        int a = scanner.nextInt();

        System.out.println("Введите число 2");
        int b = scanner.nextInt();

        int sum = a + b;

        int minus = a - b;
        int mult = a * b;
        double div = a / b;

        System.out.println("Сумма чисел равна " + sum);
        System.out.println("Разность чисел равна " + minus);
        System.out.println("Умножение чисел равно " + mult);
        System.out.println("Деление чисел равно " + div);

    }
        private static  double converter(double index) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сумму в евро");
            double euro = scanner.nextDouble();
            double dollars = euro * index;
            return  dollars;
        }
        private static double calories(double d1, double d2, double cal){


        double s1 = Math.PI * d1 * d1 / 4;
        double s2 = Math.PI * d2 * d2 / 4;

        double cal1 = s1 * cal;
        double cal2 = s2 * cal;

        double minus = cal1 - cal2;

        return minus;

        }
}


