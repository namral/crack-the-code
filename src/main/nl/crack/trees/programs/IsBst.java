package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 12/31/15.
 * Check if a binary tree is a binary search tree
 */
public class IsBst {
    public static boolean isBst(Node<Integer> rootNode) {
        return isBst(rootNode, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static <T> boolean isBst(Node<Integer> node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if (node.getValue() < min || node.getValue() > max) {
            return false;
        }
        if(!isBst(node.getLeft(), min, node.getValue()) || !isBst(node.getRight(), node.getValue(), max)) {
            return false;
        }
        return true;
    }
}

