package main.nl.crack.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Namrata Lele on 2/14/16.
 * Return all subsets of a set
 */
public class PowerSet {

    public static void main(String[] args) {
        List<List<String>> powerSet = computePowerSet(Arrays.asList("a", "b", "c"));
        System.out.println(powerSet);
    }

    private static List<List<String>> computePowerSet(List<String> input) {
        List<List<String>> powerSet = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            List<String> set = new ArrayList<>();
            set.add(input.get(i));
        }
        return null;
    }

}
