package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 3/5/16.
 * https://crazycoderzz.wordpress.com/count-the-number-of-unival-subtrees-in-a-binary-tree/
 * Given a binary tree, we need to count the number of unival subtrees (all nodes have same value).
 */
public class CountUniValue {
    private static int count = 0;

    public static int countUniValue(Node<Integer> node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }

        int l = countUniValue(node.getLeft());
        int r = countUniValue(node.getLeft());

        if (l == Integer.MAX_VALUE && r == Integer.MAX_VALUE) {
            count++;
            node.getValue();
        } else if (l == Integer.MAX_VALUE || r == Integer.MAX_VALUE) {
            if (node.getValue() == l || node.getValue() == r) {
                count++;
                return node.getValue();
            } else {
                return Integer.MIN_VALUE;
            }
        } else {
            if (node.getValue() == l && node.getValue() == r) {
                count++;
                return node.getValue();
            } else {
                return Integer.MIN_VALUE;
            }
        }
        return count;
    }
}
