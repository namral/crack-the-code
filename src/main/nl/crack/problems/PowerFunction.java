package main.nl.crack.problems;

/**
 * Created by Namrata Lele on 4/16/16.
 * Implement pow(x,y) which should return x^y both iteratively and recursively
 */
public class PowerFunction {

    public static void main(String[] args) {
        System.out.println("Power of 2^3 : " + powI(2, 3));
        System.out.println("Power of 2^3 : " + powR(2, 3));
    }

    private static int powI(int x, int y) {
        int pow = x;
        for (int i = 1; i < y; i++) {
            pow *= x;
        }
        return pow;
    }

    private static int powR(int x, int y) {
        int pow = x;
        if (y > 1) {
            return pow * powR(x, y-1);
        }
        return pow;
    }
}
