import java.util.Scanner;

public class Zadachi {
    public static void main(String[] args) {
//        int a = 22;
//        int b = 11;
//        if (Math.abs(a - 20) > Math.abs(b - 20)) {
//            System.out.println("к 20 ближе b");
//        } else System.out.println("к 20 ближе a");
//    }


        Scanner input = new Scanner(System.in);
        System.out.println("a = ");
        int a = input.nextInt();
        System.out.println("b = ");
        int b = input.nextInt();
        if (Math.abs(20 - a) == Math.abs(20 - b)) {
            System.out.println("числа a и b равноудалены от 20");
        } else if (Math.abs(20 - a) > Math.abs(20 - b)) {
            System.out.println("число b ближе к 20");
        } else System.out.println("число a ближе к 20");


        System.out.println("Выберите целое число n");
        int n = input.nextInt();
        if (n % 2 != 0) {
            System.out.println("число " + n + " нечётное");
        } else
            System.out.println("число " + n + " чётное");


        System.out.println("Выберите целое число из отрезка [5;155]");
        int d = input.nextInt();
        if (d >= 25 & d <= 100) {
            System.out.println("Выбранное число попадает в интервал (25;100)");
        } else
            System.out.println("Выбранное число не попадает в интервал (25;100)");

//        if (d <= 25 || d >= 100) {
//            System.out.println("Выбранное число не попадает в интервал (25;100)");
//        } else
//            System.out.println("Выбранное число попадает в интервал (25;100)");
//


    }
}




