package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 21;
        long b = 12;
        byte c = 12;
        char z = 'd';
        float d = 0.4f;
        double f = 0.123d;
        boolean g = true;
        short i = 14;
        String h = "Geek";
        System.out.println(resultExpression(a, b, c, d));
        System.out.println("_________________");
        System.out.println(checkRange(12, 43));
        System.out.println(checkRange(3, 15));
        System.out.println("_________________");
        valueDefinitionNumber(-2);
        valueDefinitionNumber(42);
        System.out.println("_________________");
        System.out.println(negativeNumber(13));
        System.out.println(negativeNumber(-13));
        System.out.println("_________________");
        hello("Maksim");
        System.out.println("_________________");
        leapYear(4);
        leapYear(100);
        leapYear(1404);
    }

    static float resultExpression(int a, long b, byte c, float d) {
        return a * (b + (c / d));
    }

    static boolean checkRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    static void valueDefinitionNumber(int a) {
        if (a < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положтельное");
        }
    }

    static boolean negativeNumber(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");
        }

    }
}
