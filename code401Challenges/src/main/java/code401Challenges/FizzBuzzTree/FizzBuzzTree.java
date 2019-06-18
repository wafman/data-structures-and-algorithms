package code401Challenges.FizzBuzzTree;

import code401Challenges.tree.BinaryTree;
import code401Challenges.tree.Node;


public class FizzBuzzTree<T> {


    public BinaryTree<Node> fizzBuzzTree(BinaryTree<Node> binaryTree){
        if (binaryTree.getRoot() == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        fizzSearch(binaryTree.getRoot());
        return binaryTree;
    }

    public Node<T> fizzSearch(Node node){
        if(node == null){
            return null;
        } else {
            makeTheFizz(node);
        }
        fizzSearch(node.getLeftChild());
        fizzSearch(node.getRightChild());
        return node;
    }

    public void makeTheFizz(Node node){
        if((int) node.getValue() % 3 == 0 && (int) node.getValue() % 5 == 0){
            node.setValue("FizzBuzz");
        } else if ((int) node.getValue() % 3 == 0){
            node.setValue("Fizz");
        } else if( (int) node.getValue() % 5 == 0){
            node.setValue("Buzz");
        }
    }
}
