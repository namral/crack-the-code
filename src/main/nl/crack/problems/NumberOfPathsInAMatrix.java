package main.nl.crack.problems;

import java.util.Stack;

/**
 * Created by Namrata Lele on 2/18/16.
 * Find number of paths to go from upper left corner to lower right corner.
 * You can go right or down but only if the cell value is 1
 */
public class NumberOfPathsInAMatrix {

    static int countPathsRec(int[][] a, int x, int y, int m , int n) {
        if (a[x][y] == 0) {
            return 0;
        }

        if (x == m-1 && y == n-1) {
            return 1;
        }

        int numPaths = 0;
        if (y + 1 < n) {
            numPaths += countPathsRec(a, x, y + 1, m, n);
        }
        if (x +1 < m) {
            numPaths += countPathsRec(a, x + 1, y, m, n);
        }

        return numPaths;
    }

    static class Node {
        int row;
        int col;

        public Node(int i, int j) {
            row = i;
            col = j;
        }
    }

    /* Model the problem as a graph
    * Use dfs to find number of paths
    * */
    static int countPaths(int[][] a,int M,int N) {
        Stack<Node> stack = new Stack<>();
        int pathCount = 0;
        if (a[0][0] == 0) {
            return 0;
        }
        stack.add(new Node(0, 0));
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.row == M - 1 && node.col == N -1) {
                pathCount++;
            } else {
                addChildren(a, node.row, node.col, stack, M, N);
            }
        }

        return pathCount;
    }

    private static void addChildren(int[][] a, int i, int j, Stack<Node> stack,int M,int N) {
        if (j+1 <= N-1 && a[i][j+1] == 1) {
            stack.add(new Node(i, j+1));
        }
        if (i+1 <= M-1 && a[i+1][j] == 1) {
            stack.add(new Node(i+1, j));
        }
    }

    public static void main(String[] args) {
        int inputArray[][] = {
                {1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 1, 1},
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 1}
        };
        int input[][] = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        System.out.println(countPathsRec(inputArray, 0, 0, 5, 5));
       System.out.println("DFS countPaths " + countPaths(inputArray, 5, 5));
    }
}
