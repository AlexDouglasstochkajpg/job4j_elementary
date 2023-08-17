package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static int calc2(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static int calc3(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static int calc4(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static int calc5(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
        a = 1;
        b = 1;
        c = 1;
        x = 1;
        rsl = X2.calc2(a, b, c, x);
        System.out.println(rsl);
        a = 0;
        b = 1;
        c = 1;
        x = 1;
        rsl = X2.calc3(a, b, c, x);
        System.out.println(rsl);
        a = 1;
        b = 1;
        c = 0;
        x = 1;
        rsl = X2.calc4(a, b, c, x);
        System.out.println(rsl);
        a = 1;
        b = 1;
        c = 1;
        x = 0;
        rsl = X2.calc5(a, b, c, x);
        System.out.println(rsl);
    }
}
