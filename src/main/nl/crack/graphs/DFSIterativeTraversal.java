package main.nl.crack.graphs;

import java.util.Stack;

import main.nl.crack.graphs.model.Node;

/**
 * Created by Namrata Lele on 1/30/16.
 * DFS Iterative Traversal of a graph
 */
public class DFSIterativeTraversal {

    public static void dfs(Node start, Integer search) {
        Stack<Node> stack = new Stack<>();
        stack.push(start);

        while(!stack.empty()) {
            Node top = stack.pop();
            if (top.getData() == search) {
                System.out.println("Found " + search + " in the graph");
                break;
            }
            if (!top.isVisited()) {
                top.setVisited(true);
                //Add it's neighbors to the stack
                for (Node neighbor : top.getNeighbors()) {
                    stack.push(neighbor);
                }
            }
        }
    }
}
