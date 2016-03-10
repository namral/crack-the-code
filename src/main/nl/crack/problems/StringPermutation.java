package main.nl.crack.problems;

/**
 * Created by Namrata Lele on 2/14/16.
 */
public class StringPermutation {
    public static void main(String[] args) throws Exception {
        permutation("abcd");

    }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
