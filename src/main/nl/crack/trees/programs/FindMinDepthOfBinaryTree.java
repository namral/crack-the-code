package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 2/9/16.
 */
public class FindMinDepthOfBinaryTree<T> {

    public static<T> int minDepth(Node node) {
        if (node == null) {
            return 0;
        }
        if(node.hasLeft() && node.hasRight()) {
            return Math.min(minDepth(node.getLeft()), minDepth(node.getRight())) + 1;
        } else {
            return Math.max(minDepth(node.getLeft()), minDepth(node.getRight())) + 1;
        }
    }
}
