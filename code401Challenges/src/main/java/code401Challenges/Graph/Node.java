package code401Challenges.Graph;

import java.util.HashSet;

public class Node<T> {

    public T label;
    private HashSet<Edge> neighbors;

    //constructor
    public Node(T label){
        this.label = label;
        this.neighbors = new HashSet<>();
    }

    //methods
    public boolean addNeighbor(Node<T> node){
        Edge edge = new Edge(node);
        this.neighbors.add(edge);
        Edge edge1 = new Edge(this);
        node.neighbors.add(edge1);
        return true;
    }

    public boolean addNeighbor(Node<T> node, int weight){
        Edge edge = new Edge(node, weight);
        this.neighbors.add(edge);
        Edge edge1 = new Edge(this, weight);
        node.neighbors.add(edge1);
        return true;
    }


    //getters&&setters

    public T getLabel() {
        return label;
    }

    public void setLabel(T label) {
        this.label = label;
    }

    public HashSet<Edge> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(HashSet<Edge> neighbors) {
        this.neighbors = neighbors;
    }
}
