package main.nl.crack.problems;

import java.util.HashSet;

/**
 * Created by Namrata Lele on 2/4/16.
 */
public class WordBreakProblem {
    private static HashSet<String> dictionary = new HashSet<>();

    private static boolean belongsToDictionary(String input) {
        if (input.length() == 0) {
            return true;
        }
        for (int i = 1; i <= input.length(); i++) {
            if (dictionary.contains(input.substring(0, i)) && belongsToDictionary(input.substring(i, input.length()))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        dictionary.add("go");
        dictionary.add("do");
        dictionary.add("dog");
        dictionary.add("cat");
        dictionary.add("god");
        System.out.println("Is catgoddog formed by words in the dictionary ? " + belongsToDictionary("catgoddog"));
    }
}
