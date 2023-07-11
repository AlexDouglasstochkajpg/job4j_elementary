package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = x2 - x1;
        double two = y2 - y1;
        double three = Math.pow(one, 2);
        double four = Math.pow(two, 2);
        double five = three + four;
        double rsl = Math.sqrt(five);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2,0) " + result1);
        double result2 = Point.distance(1, 1, 3, 2);
        System.out.println("result (1, 1) to (3, 2) " + result2);
        double result3 = Point.distance(4, 5, 2, 1);
        System.out.println("result (4, 5) to (2, 1) " + result3);
    }
}
