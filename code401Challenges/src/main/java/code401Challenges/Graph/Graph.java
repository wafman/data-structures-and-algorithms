package code401Challenges.Graph;

import java.util.*;

public class Graph<T> {

    private HashSet<Node<T>> adjNodesList;

    public Graph(){
        this.adjNodesList = new HashSet<>();
    }

    //add node
    public Node<T> addNode(T label){
        Node node = new Node(label);
        this.adjNodesList.add(node);
        return node;
    }

    //add edge
    public boolean addEdge(Node<T> source, Node<T> destination){
        if(this.adjNodesList.contains(source) && this.adjNodesList.contains(destination)){
            this.adjNodesList.add(source);
            this.adjNodesList.add(destination);
            return true;
        }
        return false;
    }

    //get nodes
    public HashSet<Node<T>> getAdjNodesList() {
        return adjNodesList;
    }

    //get neighbors
    public HashSet<Edge> getNeighbors(Node<T> node){
        return node.getNeighbors();
    }

    //size
    public int getSize(){
        return this.adjNodesList.size();
    }


}
