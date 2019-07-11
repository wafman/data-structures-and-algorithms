package code401Challenges.TreeIntersection;

import code401Challenges.tree.BinaryTree;
import code401Challenges.tree.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    BinaryTree<Integer> treeA;
    BinaryTree<Integer> treeB;

    @Before
    public void setTrees(){
        this.treeA = new BinaryTree();
        Node<Integer> rootA = new Node<>(1);
        Node<Integer> lA = new Node<>(2);
        Node<Integer> rA = new Node<>(3);
        Node<Integer> llA = new Node<>(4);
        Node<Integer> lrA = new Node<>(5);
        Node<Integer> rlA = new Node<>(6);
        Node<Integer> rrA = new Node<>(7);
        rootA.setLeftChild(lA);
        lA.setLeftChild(llA);
        lA.setRightChild(lrA);
        rootA.setRightChild(rA);
        rA.setLeftChild(rlA);
        rA.setRightChild(rrA);
        treeA.setRoot(rootA);

        this.treeB = new BinaryTree();
        Node<Integer> rootB = new Node<>(5);
        Node<Integer> lB = new Node<>(6);
        Node<Integer> rB = new Node<>(7);
        Node<Integer> llB = new Node<>(8);
        Node<Integer> lrB = new Node<>(9);
        Node<Integer> rlB = new Node<>(10);
        Node<Integer> rrB = new Node<>(11);
        rootB.setLeftChild(lB);
        lB.setLeftChild(llB);
        lB.setRightChild(lrB);
        rootB.setRightChild(rB);
        rB.setLeftChild(rlB);
        rB.setRightChild(rrB);
        treeB.setRoot(rootB);
    }

    //see BinaryTreeTest for verification of tree testing.

    @Test
    public void testTreeIntersection(){
        ArrayList<Integer> expectedOutput = new ArrayList<>(Arrays.asList(5,6,7));
        assertEquals("should return 5, 6, 7", expectedOutput, TreeIntersection.treeIntersection(treeA, treeB));
    }

    @Test (expected = NullPointerException.class)
    public void testTreeIntersection_Null(){
        BinaryTree<Integer> treeC = new BinaryTree<>();
        TreeIntersection.treeIntersection(treeC, treeB);
    }

}