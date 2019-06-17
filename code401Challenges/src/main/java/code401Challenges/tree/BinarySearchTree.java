package code401Challenges.tree;

public class BinarySearchTree<T extends Comparable<T>>  {
    Node<T> root;

    public BinarySearchTree(){
        root = null;
    }

    public void add(T t){
        root = addHelper(root, t);
    }

    public Node<T> addHelper(Node<T> node, T t){
        //set root if it is null
        if(node == null){
            node = new Node<>(t);
            return node;
        }
        //if root is set, add down the tree
        if(t.compareTo(node.getValue()) < 0){
            node.setLeftChild(addHelper(node.getLeftChild(), t));
        } else if(t.compareTo(node.getValue()) > 0){
            node.setRightChild(addHelper(node.getRightChild(), t));
        }
        return node;
    }

    public boolean contains(T t){
        return this.containsHelper(root, t);
    }

    public boolean containsHelper(Node<T> node, T t){
        //check if node is null, return false if so
        if(node == null){
            return false;
        }
        //check if node is equal to value
        if(node.getValue().equals(t)){
            return true;
        }
        //check the leftChild and rightChild values
        return this.containsHelper(node.getLeftChild(), t) || this.containsHelper(node.getRightChild(), t);
    }

    //getters

    public Node<T> getRoot() {
        return root;
    }
}
