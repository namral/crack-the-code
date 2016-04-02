package main.nl.crack.problems;

/**
 * Created by Namrata Lele on 3/20/16.
 * http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 *
 * Solves it by recursion.
 */
public class LCSRecursion {

    public static void main(String[] args) {
        System.out.println("LCS : " + lcs("ABCDGH", "AEDFHR"));
    }

    private static int lcs(String input1, String input2) {
        return lcs(input1.toCharArray(), input2.toCharArray(), input1.length(), input2.length());
    }

    private static int lcs(char[] input1, char[] input2, int i1, int i2) {
        if (i1 == 0 || i2 == 0) {
            return 0;
        }
        if (input1[i1 - 1] == input2[i2 - 1]) {
            return 1 + lcs(input1, input2, i1-1 ,i2-1);
        } else {
            return Math.max(lcs(input1, input2, i1, i2-1), lcs(input1, input2, i1-1 , i2));
        }
    }
}
