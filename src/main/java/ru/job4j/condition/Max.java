package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int middle) {
        int tmp = max(right, middle);
        int result = left > tmp ? left : tmp;
        return result;
    }

    public static int max(int left, int right, int middle, int finish) {
        int tmp = max(right, middle, finish);
        int result = left > tmp ? left : tmp;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(1, 3, 2));
        System.out.println(max(1, 3, 2, 4));
    }
}
