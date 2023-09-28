package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] numbers = new char[][] {
                {'X', 'X', 'X'},
                {'X', ' ', 'X'},
                {'X', 'X', 'X'}
        };
        int row = 1;
        boolean rsl = monoHorizontal(numbers, row);
        System.out.println(rsl);
    }
}
