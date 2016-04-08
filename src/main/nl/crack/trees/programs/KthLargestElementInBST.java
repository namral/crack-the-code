package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata on 4/6/16.
 */
public class KthLargestElementInBST {
    private static boolean flag = false;

    //Traverse the tree in order but to get second largest do right - root - left
    public static void findLargest(Node<Integer> root, Integer level, int k) {
        if (root == null) {
            return;
        }
        findLargest(root.getRight(), level, k);
        level++;
        if (level == k && flag == false) {
            flag = true;
            System.out.println("kth largest : " + root.getValue());
            return;
        }
        findLargest(root.getLeft(), level, k);
    }
}
