package code401Challenges.tree;

import code401Challenges.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void testConstructor(){
        BinarySearchTree bst = new BinarySearchTree();
        assertTrue("should return true", bst.getRoot() == null);
    }

    @Test
    public void testAdd_singleValue(){
        BinarySearchTree bst =  new BinarySearchTree();
        bst.add(5);
        assertEquals("root should equal 5", 5, bst.getRoot().getValue());
    }

    @Test
    public void testAdd_multipleValue(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        bst.add(5);
        bst.add(15);
        assertEquals("root should equal 10", 10, bst.getRoot().getValue());
        assertEquals("leftChild should equal 5", 5, bst.getRoot().getLeftChild().getValue());
        assertEquals("rightChild should equal 15", 15, bst.getRoot().getRightChild().getValue());
    }

    @Test
    public void testContains_failure(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        assertFalse("should return false", bst.contains(5));
    }

    @Test
    public void testContains_failure_null(){
        BinarySearchTree bst = new BinarySearchTree();
        assertFalse("should be null", bst.contains(5));
    }

    @Test
    public void testContains_singleValue_success(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(10);
        assertTrue("should return true", bst.contains(10));
    }

    @Test
    public void testContains_multiplevalues(){
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(25);
        bst.add(-25);
        bst.add(50);
        bst.add(15);
        bst.add(30);
        assertTrue("should return true", bst.contains(-25));
        assertTrue("should return true", bst.contains(30));
        assertTrue("should return true", bst.contains(50));
        assertTrue("should return true", bst.contains(15));
    }

}