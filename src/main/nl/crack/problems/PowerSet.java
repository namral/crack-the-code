package main.nl.crack.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Namrata Lele on 2/14/16.
 * Return all subsets of a set
 * http://www.programcreek.com/2013/01/leetcode-subsets-java/
 */
public class PowerSet {

    public static void main(String[] args) {
        int[] s = {1, 2, 3};
        List<List<Integer>> powerSet = subsets(s);
        System.out.println(powerSet);
    }

    public static List<List<Integer>> subsets(int[] set) {
        if (set == null)
            return null;

        Arrays.sort(set);
        List<List<Integer>> result =  new ArrayList<>();

        for (int i = 0; i < set.length; i++) {
            List<List<Integer>> temp = new ArrayList<>();

            //get sets that are already in result
            for (List<Integer> a : result) {
                temp.add(new ArrayList<>(a));
            }

            //add set[i] to existing sets
            for (List<Integer> a : temp) {
                a.add(set[i]);
            }

            //add set[i] only as a set
            List<Integer> single = new ArrayList<>();
            single.add(set[i]);
            temp.add(single);

            result.addAll(temp);
        }
        //add empty set
        result.add(new ArrayList<Integer>());

        return result;
    }
}
