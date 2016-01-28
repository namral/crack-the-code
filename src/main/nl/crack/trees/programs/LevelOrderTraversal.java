package main.nl.crack.trees.programs;

import java.util.LinkedList;
import java.util.Queue;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 1/9/16.
 * Level order traversal using a Queue
 */
public class LevelOrderTraversal<T> {
    public static<T> void levelOrderTraversal(Node<T> node) {
        if(node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        System.out.println(node.getValue().toString());
        do {
            addChildrenToQueue(node, queue);
            node = queue.remove();
            System.out.println(node.getValue().toString());
        } while (!queue.isEmpty());
    }

    private static <T> void addChildrenToQueue(Node<T> node, Queue<Node> queue) {
        if(node.hasLeft()) {
            queue.add(node.getLeft());
        }
        if(node.hasRight()) {
            queue.add(node.getRight());
        }
    }
}

