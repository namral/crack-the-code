package main.nl.crack.problems;

/**
 * Created by Namrata Lele on 2/13/16.
 * https://www.hackerrank.com/challenges/connected-cell-in-a-grid
 */
public class ConnectedCellInGrid {
    public static int count(int a[][], int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }

        if (a[i][j] == 1) {
            return count(a, i+1, j, m, n) + count(a, i, j+1, m, n) + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int inputArray[][] = {
                {1, 0, 0},
                {0, 1, 1},
                {0, 0, 0}
        };
        System.out.println(count(inputArray, 0, 0, 3, 3));
    }
}
