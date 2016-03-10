package main.nl.crack.problems;

/**
 * Created by Namrata Lele on 2/14/16.
 * A child going up a staircase with n steps, can hop up 1, 2, or 3 steps at a time.
 * How many ways can the child reach the top?
 */
public class ChildStair {

    public static void main(String[] args) {
        System.out.println(count(4));
    }

    private static int count(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return count(n - 1) + count(n - 2) + count(n - 3);
    }
}
