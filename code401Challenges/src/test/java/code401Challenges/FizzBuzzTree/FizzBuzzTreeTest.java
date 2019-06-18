package code401Challenges.FizzBuzzTree;

import code401Challenges.tree.BinaryTree;
import code401Challenges.tree.Node;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;


public class FizzBuzzTreeTest {


    @Test
    public void testFizzBuzzTree_idealHappy(){
        //Fizz == divisible by 3
        //Buzz == divisible by 5
        //FizzBuzz == divisible by 3 and 5
        BinaryTree<Integer> bt = new BinaryTree<>();
        Node<Integer> root = new Node<>(5);
        Node<Integer> l = new Node<>(9);
        Node<Integer> r = new Node<>(11);
        Node<Integer> ll = new Node<>(21);
        Node<Integer> lr = new Node<>(25);
        Node<Integer> rl = new Node<>(32);
        Node<Integer> rr = new Node<>(15);
        root.setLeftChild(l);
        l.setLeftChild(ll);
        l.setRightChild(lr);
        root.setRightChild(r);
        r.setLeftChild(rl);
        r.setRightChild(rr);
        bt.setRoot(root);
        FizzBuzzTree theFizz = new FizzBuzzTree();
        theFizz.fizzBuzzTree(bt);
        assertEquals("should return a mix of fizz, buzz, fizzBuzz and numbers.",
                new ArrayList<>(Arrays.asList("Buzz", "Fizz", "Fizz", "Buzz", 11, 32, "FizzBuzz" )),
                 bt.preOrder());
    }

    @Test
    public void testFizzBuzzTree_negativeNumbers(){
        BinaryTree<Integer> bt = new BinaryTree<>();
        Node<Integer> root = new Node<>(-5);
        Node<Integer> l = new Node<>(-9);
        Node<Integer> r = new Node<>(11);
        Node<Integer> ll = new Node<>(15);
        Node<Integer> lr = new Node<>(25);
        Node<Integer> rl = new Node<>(-32);
        Node<Integer> rr = new Node<>(-15);
        root.setLeftChild(l);
        l.setLeftChild(ll);
        l.setRightChild(lr);
        root.setRightChild(r);
        r.setLeftChild(rl);
        r.setRightChild(rr);
        bt.setRoot(root);
        FizzBuzzTree theFizz = new FizzBuzzTree();
        theFizz.fizzBuzzTree(bt);
        assertEquals("should return a mix of Fizz, Buzz, FizzBuzz and numbers",
                new ArrayList<>(Arrays.asList("Buzz", "Fizz", "FizzBuzz", "Buzz", 11, -32, "FizzBuzz")),
                bt.preOrder());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFizzBuzzTree_emptyTree(){
        BinaryTree bt = new BinaryTree();
        FizzBuzzTree theFizz = new FizzBuzzTree();
        theFizz.fizzBuzzTree((bt));
    }

}