package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        money = money - price;
        for (int coin : coins) {
            while (money - coin >= 0) {
                rsl[size] = coin;
                money -= coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] coins = change(100, 25);
        for (int i = 0; i < coins.length; i++) {
            System.out.println(coins[i]);
        }
    }
}
