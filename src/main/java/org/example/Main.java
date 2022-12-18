package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();
        task3Calc();
    }
    public  static void task1(){
        System.out.println(("Факториал какого числа вычислить? "));
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println("Результат: " + fact(num));
    }
    public static int fact(int num){
        if (num <=1) return 1;
        else return num * fact(num-1);
    }


    /*Вывести все простые числа от 1 до 1000*/
    public static void task2(){
        System.out.println("Все простые числа от 1 до 1000: ");
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i))  System.out.print(i + " ");
        }
    }
    /*проверка на простоту*/
    public static boolean isPrime(int num){
        boolean prime = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0){
                prime = false;
                break;
            }
        }
        return  prime;
    }

    public static  void task3Calc(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = in.nextDouble();
        System.out.println("Введите операцию: ");
        char op = in.next().charAt(0);
        System.out.println("Введите второе число: ");
        double num2 = in.nextDouble();
        double rez = 0;
        boolean err = false;
        switch (op){
            case '+' : rez = num1 + num2;
                break;
            case '-' : rez = num1 - num2;
                break;
            case '/' : rez = num1 / num2;
                break;
            case '*' : rez = num1 * num2;
                break;
            default:
                System.out.println("что-то пошло не так ");
                err = true;
                break;
        }
        if (!err) System.out.printf("%.2f %c %.2f = %.2f \n", num1, op , num2, rez );
    }
}