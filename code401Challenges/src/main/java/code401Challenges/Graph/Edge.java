package code401Challenges.Graph;

public class Edge<T> {

    private int weight;

    private Node<T> node;

    //constructors
    public Edge(Node<T> node){
        this.node = node;
    }

    public Edge(Node<T> node, int weight){
        this.node = node;
        this.weight = weight;
    }

    //getters&&setters


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }
}
