package main.nl.crack.trees.programs;

import java.util.Stack;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 1/7/16.
 * Inorder traversal
 * 1) Traverse left all the way
 * 2) Pop and print
 * 3) popped node has right ? Get the node and repeat 1 through three
 */
public class IterativeInorderTraversal<T> {

    public static<T> void inOrder(Node<T> node) {
        Stack<Node> stack = new Stack<Node>();
        stack.push(node);
        while (!stack.empty()) {
            traverseLeft(node, stack);
            node = stack.pop();
            System.out.println(node.getValue().toString());
            if (node.hasRight()) {
                node = node.getRight();
                stack.push(node);
            }
        }
    }

    private static<T> void traverseLeft(Node<T> node, Stack stack) {
        while(node != null) {
            node = node.getLeft();
            if (node != null) {
                stack.push(node);
            }
        }
    }
}
