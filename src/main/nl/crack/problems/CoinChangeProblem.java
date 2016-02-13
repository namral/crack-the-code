package main.nl.crack.problems;

import java.util.Arrays;

/**
 * Created by Namrata Lele on 2/7/16.
 * https://www.hackerrank.com/challenges/coin-change
 * How many different ways can you make change for an amount, given a list of coins?
 */
public class CoinChangeProblem {
    public static int change(int amount, int[] denominations, int index) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        if (index == denominations.length && amount > 0) {
            return 0;
        }
        return change(amount - denominations[index], denominations, index) + change(amount, denominations, index + 1);
    }

    public static void main(String[] args) {
        System.out.println("Number of ways to get change for amount 5 with 1, 2, 3, 4, 5 : " + change(5, new int[]{1, 2, 3, 4, 5}, 0));
    }
}
