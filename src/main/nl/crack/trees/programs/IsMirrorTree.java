package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 3/5/16.
 */
public class IsMirrorTree {

    public static boolean isMirror(Node<Integer> left, Node<Integer> right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null && left.getValue() == right.getValue()) {
            return isMirror(left.getLeft(), right.getRight()) && isMirror(left.getRight(), right.getLeft());
        }
        return false;
    }
}
