package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException(
                    "Массив не должен быть null и должен содержать как минимум два элемента."
            );
        }
        int[] result = {};
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                result = new int[] {i, j};
                break;
            } else if (array[i] + array[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25, 30};
        int target = 35;
        int[] rsl = getIndexes(array, target);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }
}
