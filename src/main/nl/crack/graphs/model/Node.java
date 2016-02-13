package main.nl.crack.graphs.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Namrata Lele on 1/30/16.
 * Node representation in a graph
 */
public class Node {
    private List<Node> neighbors = new ArrayList<>();
    private Integer data;
    private boolean visited;

    public Node(Integer data) {
        this.data = data;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void addNeighbors(Node neighbor) {
        this.neighbors.add(neighbor);
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
