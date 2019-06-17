package code401Challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    public BinaryTree<Integer> binaryTree;

    @Before
    public void setTree(){
        this.binaryTree = new BinaryTree();
        Node<Integer> root = new Node<>(1);
        Node<Integer> l = new Node<>(2);
        Node<Integer> r = new Node<>(3);
        Node<Integer> ll = new Node<>(4);
        Node<Integer> lr = new Node<>(5);
        Node<Integer> rl = new Node<>(6);
        Node<Integer> rr = new Node<>(7);
        root.setLeftChild(l);
        l.setLeftChild(ll);
        l.setRightChild(lr);
        root.setRightChild(r);
        r.setLeftChild(rl);
        r.setRightChild(rr);
        this.binaryTree.setRoot(root);
    }


    @Test
    public void testConstructor(){
        BinaryTree binaryTree = new BinaryTree();
        assertTrue("should return true", binaryTree.getRoot() == null);
    }

    @Test
    public void testPreOrder(){
        assertEquals("should return correct order: root, left, right",
                new ArrayList<>(Arrays.asList(1,2,4,5,3,6,7)),
                this.binaryTree.preOrder());
    }

    @Test
    public void testInOrder(){
        assertEquals("should return correct order: left, root, right.",
                new ArrayList<>(Arrays.asList(4, 2, 5, 1, 6, 3, 7)),
                this.binaryTree.inOrder());
    }

    @Test
    public void testPostOrder(){
        assertEquals("should return correct order: left, right, root",
                new ArrayList<>(Arrays.asList(4, 5, 2, 6, 7, 3, 1)),
                this.binaryTree.postOrder());
    }

}