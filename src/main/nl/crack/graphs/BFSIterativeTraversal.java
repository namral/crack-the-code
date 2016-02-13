package main.nl.crack.graphs;

import java.util.LinkedList;
import java.util.Queue;

import main.nl.crack.graphs.model.Node;

/**
 * Created by Namrata Lele on 1/30/16.
 * BFS Iterative Traversal of a graph
 */
public class BFSIterativeTraversal {

    public static void bfs(Node start, Integer search) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(start);
        start.setVisited(true);

        while (!queue.isEmpty()) {
            Node top = queue.remove();
            if(top.getData() == search) {
                System.out.println("Found " + search + " in the graph");
            }
            for (Node node : top.getNeighbors()) {
                if (!node.isVisited()) {
                    queue.add(node);
                    node.setVisited(true);
                }
            }
        }
    }
}
