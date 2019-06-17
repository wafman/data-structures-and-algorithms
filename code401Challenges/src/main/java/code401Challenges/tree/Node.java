package code401Challenges.tree;

public class Node<T> {
    Node<T> root;
    Node<T> leftChild;
    Node<T> rightChild;
    T value;

    public Node(T value){
        this.value = value;
    }
}
