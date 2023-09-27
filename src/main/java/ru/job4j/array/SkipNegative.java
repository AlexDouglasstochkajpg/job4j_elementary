package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = {{-7, 2}, {5, 1, -10}};
        int[][] result = skip(array);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}
