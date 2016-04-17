package main.nl.crack.problems;

/**
 * Created by Namrata Lele on 4/16/16.
 * http://www.geeksforgeeks.org/pascal-triangle/
 1
 1 1
 1 2 1
 1 3 3 1
 1 4 6 4 1
 1 5 10 10 5 1
 */
public class PascalTriangle {

    public static void printPascalsTriangle(int n) {
        int arr[][] = new int[n][n];
        for (int line = 0; line < n; line++)
        {
            for (int i = 0; i <= line; i++)
            {
                if (line == i || i == 0)
                    arr[line][i] = 1;
                else //sum of values just above and left of above
                    arr[line][i] = arr[line-1][i-1] + arr[line-1][i];
                System.out.print(arr[line][i]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPascalsTriangle(6);
    }
}

