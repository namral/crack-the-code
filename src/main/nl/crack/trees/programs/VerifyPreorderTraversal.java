package main.nl.crack.trees.programs;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Namrata Lele on 2/13/16.
 * Given a preorder traversal verify if it can be a valid BST
 */
public class VerifyPreorderTraversal {
    public static boolean verify(List<Integer> preorder) {
        if (preorder == null || preorder.size() <= 2) {
            return true;
        }
        Integer root = preorder.get(0);
        Integer mid = -1;
        //Find the first number greater than root.
        for (int i = 0; i < preorder.size(); i++) {
            if (preorder.get(i) > root) {
                mid = i;
                break;
            }
        }
        //If you can't find a number greater than root the tree is invalid
        if (mid < 0) {
            return false;
        }
        return verify(preorder.subList(1, mid)) && verify(preorder.subList(mid, preorder.size()));
    }

    public static void main(String[] args) {
        List<Integer> preorder = Arrays.asList(8, 9, 1, 6, 4, 7, 10, 14, 13);
        System.out.println(verify(preorder));
    }
}
