package code401Challenges.tree;

public class Node<T> {
    private Node<T> leftChild;
    private Node<T> rightChild;
    private T value;

    public Node(T value){
        this.value = value;
    }

    //getters

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public T getValue() {
        return value;
    }

    //setters

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
