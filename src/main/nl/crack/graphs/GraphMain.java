package main.nl.crack.graphs;

import main.nl.crack.graphs.model.Node;

/**
 * Created by Namrata Lele on 1/30/16.
 */
public class GraphMain {
    public static void main(String[] args) {
        /**
         * Create graph
         */
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.addNeighbors(node2);
        node1.addNeighbors(node4);
        node2.addNeighbors(node1);
        node2.addNeighbors(node3);
        node2.addNeighbors(node4);
        node3.addNeighbors(node2);
        node3.addNeighbors(node4);
        node4.addNeighbors(node1);
        node4.addNeighbors(node2);
        node4.addNeighbors(node3);

        DFSIterativeTraversal.dfs(node1, 4);
        BFSIterativeTraversal.bfs(node1, 4);
        Boolean.TRUE.equals(null);
    }
}
