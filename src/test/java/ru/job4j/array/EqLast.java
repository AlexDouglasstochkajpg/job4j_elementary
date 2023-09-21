package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            if (left[left.length - 1] != right[right.length - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {1, 2, 3};
        System.out.println(check(left, right));
    }
}
