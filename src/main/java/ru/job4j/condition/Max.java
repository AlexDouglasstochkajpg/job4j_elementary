package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int middle) {
        return max(left, max(right, middle));
    }

    public static int max(int left, int right, int middle, int finish) {
        return max(left, max(right, middle, finish));
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(1, 3, 2));
        System.out.println(max(1, 3, 2, 4));
    }
}
