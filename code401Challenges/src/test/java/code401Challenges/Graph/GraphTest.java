package code401Challenges.Graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testAdd(){
        Graph graph = new Graph();
        graph.addNode("Test");
        String[] expectedOutput = {"Test"};
        assertEquals(expectedOutput, graph.getNodes());
    }

}