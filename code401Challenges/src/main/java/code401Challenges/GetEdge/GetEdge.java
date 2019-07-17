package code401Challenges.GetEdge;

import code401Challenges.Graph.Edge;
import code401Challenges.Graph.Graph;
import code401Challenges.Graph.Node;

import java.util.HashSet;

public class GetEdge<T> {

    boolean output = false;
    int cost = 0;

    public GetEdge(){}

    public GetEdge(boolean output, int cost){
        this.output = output;
        this.cost = cost;
    }

    public GetEdge directFlights(Graph graph, String[] arr){
// check if current is null, if so, return false

        HashSet<Node> h = graph.getAdjNodesList();
        Node current = null;
        int totalCost = 0;

        for(Node node : h){
            if(node.label.equals(arr[0])){
                current = node;
            }
        }


        if(current == null){
            GetEdge answer = new GetEdge(false, 0);
            return answer;
        }
        HashSet<Edge> edges;
        boolean checked;
        for(int i = 1; i < arr.length; i++){
            edges = current.getNeighbors();
            checked = false;
            for(Edge e : edges){
                if(e.getNode().label.equals(arr[i])){
                    totalCost += e.getWeight();
                    checked = true;
                    //make sure to advance current, otherwise you're never checking the next nodes neighbors.
                    current = e.getNode();
                }
            }
            if(!checked){
                GetEdge answer = new GetEdge(false, 0);
                return answer;
            }
        }


        GetEdge answer = new GetEdge(true, totalCost);
        System.out.println(answer.output);
        System.out.println(answer.cost);
        return answer;
    }



}
