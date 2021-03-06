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

    //breadth first search
    public ArrayList<Node> breadthFristSearch(Node<T> node){
        Queue<Node> toBeVisited = new LinkedList<>();
        HashSet<Node> visited = new HashSet<>();
        ArrayList<Node> output = new ArrayList<>();
        toBeVisited.add(node);
        visited.add(node);

        while(!toBeVisited.isEmpty()){
            Node current = toBeVisited.remove();
            output.add(current);

            HashSet<Edge> neighbors = current.getNeighbors();
            for(Edge neighbor: neighbors){
                if(!visited.contains(neighbor.getNode())){
                    toBeVisited.add(neighbor.getNode());
                    visited.add(neighbor.getNode());
                }
            }
        }
        return output;
    }

    //depth first search
    public ArrayList<Node> depthFirstSearch(Node<T> node){
        Stack stack = new Stack();
        HashSet<Node> visited = new HashSet<>();
        ArrayList<Node> output = new ArrayList<>();
        stack.push(node);
        visited.add(node);
        while(!stack.isEmpty()){
            Node current = (Node) stack.pop();
            output.add(current);
            HashSet<Edge> neighbors = current.getNeighbors();
            for(Edge neightbor: neighbors ){
                if(!visited.contains(neightbor.getNode())){
                    stack.push(neightbor.getNode());
                    visited.add(neightbor.getNode());
                }
            }
        }
        return output;
    }



}
