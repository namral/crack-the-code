package main.nl.crack.trees.programs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.nl.crack.trees.model.Node;

/**
 * Created by Namrata Lele on 2/11/16.
 * Write a program to serialize and deserialize a binary tree
 */
public class SerializeDeserializeBinaryTree {

    /**
     * Method walks the tree in pre order and also stores null in case of left or right tree being null
     *
     */
    public static void serialize(Node<Integer> node, List<String> strings) {
        if (node == null) {
            strings.add("null");
            return;
        }
        strings.add(String.valueOf(node.getValue()));
        serialize(node.getLeft(), strings);
        serialize(node.getRight(), strings);
    }


    public static Node deserialize(List<String> data) {
        Node<Integer> node = new Node(null);
        deserializeRecursive(new LinkedList<>(data), node);
        return node;
    }

    private static void deserializeRecursive(Queue<String> nodes, Node<Integer> node) {
        if (nodes.isEmpty()) {
            return;
        }
        String value = nodes.remove();
        if (value.equals("null")) {
            return;
        }

        Integer nodeValue = Integer.valueOf(value);;
        node.setValue(nodeValue);
        node.setLeft(new Node<>(null));
        deserializeRecursive(nodes, node.getLeft());
        node.setRight(new Node<>(null));
        deserializeRecursive(nodes, node.getRight());
        }
    }
