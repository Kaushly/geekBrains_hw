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

/*
1. Создать пустой проект в IntelliJ IDEA и прописать метод main();

2. Создать переменные всех пройденных типов данных, и инициализировать их значения;

3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – входные параметры этого метода;

4. Написать метод, принимающий на вход два числа,
и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

5. Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

6. Написать метод, которому в качестве параметра передается целое число,
метод должен вернуть true, если число отрицательное;

7. Написать метод, которому в качестве параметра передается строка,
обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

8. * Написать метод, который определяет является ли год високосным,
 и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

