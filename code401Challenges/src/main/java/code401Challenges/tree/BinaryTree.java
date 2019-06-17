package code401Challenges.tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    private Node<T> root;


    public BinaryTree(){
        root = null;
    }

    public ArrayList<T> preOrder(){
        ArrayList<T> output = new ArrayList<>();
        if(root == null){
            return output;
        }
        preOrderHelper(root, output);

        return output;
    }

    public void preOrderHelper(Node<T> node, ArrayList<T> arr){
        arr.add(node.getValue());
        if(node.getLeftChild() != null){
            preOrderHelper(node.getLeftChild(), arr);
        }
        if(node.getRightChild() != null){
            preOrderHelper(node.getRightChild(), arr);
        }
    }


    public ArrayList<T> inOrder(){
        ArrayList<T> output = new ArrayList<>();
        if(root == null){
            return output;
        }
        inOrderHelper(root, output);
        return output;
    }

    public void inOrderHelper(Node<T> node, ArrayList<T> arr){
        if(node.getLeftChild() != null){
            inOrderHelper(node.getLeftChild(), arr);
        }

        arr.add(node.getValue());

        if(node.getRightChild() != null){
            inOrderHelper(node.getRightChild(), arr);
        }
    }

    public ArrayList<T> postOrder(){
        ArrayList<T> output = new ArrayList<>();
        if(root == null){
            return output;
        }
        postOrderHelper(root, output);
        return output;
    }

    public void postOrderHelper(Node<T> node, ArrayList<T> arr){
        if(node.getLeftChild() != null){
            postOrderHelper(node.getLeftChild(), arr);
        }
        if(node.getRightChild() != null){
            postOrderHelper(node.getRightChild(), arr);
        }
        arr.add(node.getValue());
    }

    //getters

    public Node<T> getRoot() {
        return root;
    }


    //setters


    public void setRoot(Node<T> root) {
        this.root = root;
    }
}