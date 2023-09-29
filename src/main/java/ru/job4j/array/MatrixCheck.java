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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
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
        int column = 2;
        rsl = monoVertical(numbers, column);
        System.out.println(rsl);
        char[][] nums = new char[][] {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'}
        };
        System.out.println(extractDiagonal(nums));

    }
}
