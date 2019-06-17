package code401Challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void testConstructor(){
        Node n = new Node(1);
        assertTrue("root should equal 1", n.getValue().equals(1));
    }

}