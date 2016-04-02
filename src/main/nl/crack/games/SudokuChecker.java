package main.nl.crack.games;

import java.util.HashSet;

/**
 * Created by Namrata Lele on 1/28/16.
 * Sudoku checker
 */
public class SudokuChecker {
    public static void main(String[] args) {
        int inputArray[][] = {
           {5,3,4,6,7,8,9,1,2},
           {6,7,2,1,9,5,3,4,8},
           {1,9,8,3,4,2,5,6,7},
           {8,5,9,7,6,1,4,2,3},
           {4,2,6,8,5,3,7,9,1},
           {7,1,3,9,2,4,8,5,6},
           {9,6,1,5,3,7,2,8,4},
           {2,8,7,4,1,9,6,3,5},
           {3,4,5,2,8,6,1,7,9}
        };

        for (int row = 0; row < 9; row++) {
            HashSet<Integer> numbers = new HashSet<>();

            //Check if valid
            for (int col = 0; col < 9; col++) {
                if (numbers.contains(inputArray[row][col])) {
                    System.out.println("Invalid sudo at row " +  row + " column " + col);
                } else {
                    numbers.add(inputArray[row][col]);
                }
            }
        }
    }
}
