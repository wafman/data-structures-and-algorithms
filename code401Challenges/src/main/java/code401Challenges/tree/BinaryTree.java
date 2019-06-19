package code401Challenges.tree;

import java.util.*;

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

    public String breadthFirst(BinaryTree<Node> binaryTree){
        Queue<Node> queue = new LinkedList<>();
        String answer = "";
        queue.add(binaryTree.root);
        while(queue.peek() != null){
            answer += queue.remove();
            queue.add(root.getLeftChild());
            queue.add(root.getRightChild());
        }
        return answer;
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
