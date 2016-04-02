package main.nl.crack.problems;

/**
 * Created by Namrata Lele on 2/14/16.
 * http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 */
public class StringPermutation {
    public static void main(String[] args) throws Exception {
        permutation("abcd");

    }

    public static void permutation(String str) {
        permutation(str.toCharArray(), 0, str.length() - 1);
    }

    private static void permutation(char[] input, int l, int r) {
        if (l == r) {
            System.out.println(input);
        } else {
            for (int i = l; i <= r; i++) {
                swap(input, l,i);
                permutation(input, l+1, r);
                swap(input, l,i);
            }

        }
    }

    private static void swap(char[] input, int i1, int i2) {
        char temp = input[i1];
        input[i1] = input[i2];
        input[i2] = temp;
    }
}
