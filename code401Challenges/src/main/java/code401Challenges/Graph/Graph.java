package code401Challenges.Graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Graph {

    private int n;
    private Map<Node, List<Node>> adjNodesList;

    public Graph(){
        this.adjNodesList = new HashMap<Node, List<Node>>();
    }

    //add node
    public Node addNode(String label){
        Node node = new Node(label);
        adjNodesList.putIfAbsent(node, new ArrayList<>());
        return node;
    }

    //add edge
    public void addEdge(String label1, String label2){
        Node node1 = new Node(label1);
        Node node2 = new Node(label2);
        adjNodesList.get(node1).add(node2);
        adjNodesList.get(node2).add(node1);
    }

    //get nodes
    public Map<Node, List<Node>> getNodes() {
        return adjNodesList;
    }

    //get neighbors
    public List<Node> getNeightbors(Node node){
        return node.getNeighbors();
    }

    //size
    public int getSize(){
        return adjNodesList.size();
    }


}
