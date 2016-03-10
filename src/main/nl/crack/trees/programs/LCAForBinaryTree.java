package main.nl.crack.trees.programs;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 3/3/16.
 */
public class LCAForBinaryTree <T> {

    public static Node<Integer> lowestCommonAncestor(Node<Integer> node, Node<Integer> node1, Node<Integer> node2) {
        if (node == null) {
           return null;
        }
        if (node.getValue() == node1.getValue() || node.getValue() == node2.getValue()) {
            return node;
        }

        Node leftNode = lowestCommonAncestor(node.getLeft(), node1, node2);
        Node rightNode = lowestCommonAncestor(node.getRight(), node1, node2);

        if (leftNode != null && rightNode != null) {
            return node;
        }

        return leftNode == null ? rightNode : leftNode;
    }
}
