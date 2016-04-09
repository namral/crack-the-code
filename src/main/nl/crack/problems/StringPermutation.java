package main.nl.crack.problems;

/**
 * Created by Namrata Lele on 2/14/16.
 * http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 */
public class StringPermutation {
    public static void main(String[] args) throws Exception {
        System.out.println("perm1 :");
        permutation1("abcd");
        System.out.println("perm2 :");
        permutation2("abc");
    }

    public static void permutation1(String str) {
        permutation1(str.toCharArray(), 0, str.length() - 1);
    }

    private static void permutation1(char[] input, int l, int r) {
        if (l == r) {
            System.out.println(input);
        } else {
            for (int i = l; i <= r; i++) {
                swap(input, l,i);
                permutation1(input, l + 1, r);
                swap(input, l,i); //restore back input
            }

        }
    }

    private static void swap(char[] input, int i1, int i2) {
        char temp = input[i1];
        input[i1] = input[i2];
        input[i2] = temp;
    }

    public static void permutation2(String str) {
        permutation2("", str);
    }

    private static void permutation2(String prefix, String str) {
        System.out.println("prefix : " + prefix + " String : "  + str);
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        for (int i = 0; i < str.length(); i++) {
            permutation2(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
