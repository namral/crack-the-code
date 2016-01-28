package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 1/9/16.
 * Calculate height of a binary tree
 */
public class HeightOfBinaryTreeRecursive {
    public static<T> int height(Node<T> node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.getLeft()), height(node.getRight())) + 1;
    }
}
