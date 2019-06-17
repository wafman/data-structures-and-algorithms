package code401Challenges.tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    Node<T> root;


    public BinaryTree(){
        root = null;
    }

    public ArrayList<T> preOrder(Node<T> node){
        ArrayList<T> output = new ArrayList<>();
        if(node == null){
            return output;
        }
        preOrderHelper(node, output);

        return output;
    }

    public void preOrderHelper(Node<T> node, ArrayList<T> arr){
        arr.add(node.value);
        if(node.leftChild != null){
            preOrderHelper(node.leftChild, arr);
        }
        if(node.rightChild != null){
            preOrderHelper(node.rightChild, arr);
        }
    }


    public ArrayList<T> inOrder(Node<T> node){
        ArrayList<T> output = new ArrayList<>();
        if(node == null){
            return output;
        }
        inOrderHelper(node, output);
        return output;
    }

    public void inOrderHelper(Node<T> node, ArrayList<T> arr){
        if(node.leftChild != null){
            inOrderHelper(node.leftChild, arr);
        }

        arr.add(node.value);

        if(node.rightChild != null){
            inOrderHelper(node.rightChild, arr);
        }
    }

    public ArrayList<T> postOrder(Node<T> node){
        ArrayList<T> output = new ArrayList<>();
        if(node == null){
            return output;
        }
        postOrderHelper(node, output);
        return output;
    }

    public void postOrderHelper(Node<T> node, ArrayList<T> arr){
        if(node.leftChild != null){
            postOrderHelper(node.leftChild, arr);
        }
        if(node.rightChild != null){
            postOrderHelper(node.rightChild, arr);
        }
        arr.add(node.value);
    }

}
