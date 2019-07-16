package code401Challenges.Graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testEmptyGraph(){
        Graph graph = new Graph();
        assertEquals(0, graph.getSize());
    }

    @Test
    public void testAdd_single(){
        Graph graph = new Graph();
        graph.addNode("Test");
        assertEquals(1, graph.getSize());
    }

    @Test
    public void testAdd_multiple(){
        Graph graph = new Graph();
        Node one = graph.addNode(1);
        Node two = graph.addNode(2);
        Node three = graph.addNode(3);

        assertTrue(graph.getSize() == 3);
        assertTrue(graph.getAdjNodesList().contains(one));
        assertTrue(graph.getAdjNodesList().contains(two));
        assertTrue(graph.getAdjNodesList().contains(three));
    }

    @Test
    public void testAddEdge(){
        Graph graph = new Graph();
        Node one = graph.addNode(1);
        Node two = graph.addNode(2);
        assertTrue(graph.addEdge(one, two));
    }


    @Test
    public void testAddNeighbor_noWeight(){
        Graph graph = new Graph();
        Node one = graph.addNode(1);
        Node two = graph.addNode(2);
        assertTrue(one.addNeighbor(two));
    }

    @Test
    public void testAddNeightbor_weight(){
        Graph graph = new Graph();
        Node one = graph.addNode(1);
        Node two = graph.addNode(2);
        assertTrue(one.addNeighbor(two, 108));
    }

    @Test
    public void testGetNeighbors(){
        Graph graph = new Graph();
        Node one = graph.addNode(1);
        Node two = graph.addNode(2);
        Node three = graph.addNode(3);

        one.addNeighbor(two);
        one.addNeighbor(three);

        HashSet expectedOutput = new HashSet();
        expectedOutput.add(2);
        expectedOutput.add(3);

        assertEquals(expectedOutput.size(), graph.getNeighbors(one).size());
    }

    @Test
    public void testAdjacentNodes(){
        Graph graph = new Graph();
        Node one = graph.addNode(1);
        Node two = graph.addNode(2);
        Node three = graph.addNode(3);


        HashSet<Node> expectedOutput = new HashSet<>();
        expectedOutput.add(one);
        expectedOutput.add(two);
        expectedOutput.add(three);

        assertTrue(graph.getAdjNodesList().equals(expectedOutput));
    }

    @Test
    public void testBreadthFirstSearch(){
        Graph graph = new Graph();
        Node one = graph.addNode(1);
        Node two = graph.addNode(2);
        Node three = graph.addNode(3);
        Node four = graph.addNode(4);
        Node five = graph.addNode(5);

        one.addNeighbor(two);
        one.addNeighbor(three);
        two.addNeighbor(four);
        five.addNeighbor(three);

        ArrayList<Node> expectedOutput = new ArrayList<>();
        expectedOutput.add(one);
        expectedOutput.add(three);
        expectedOutput.add(two);
        expectedOutput.add(five);
        expectedOutput.add(four);

        ArrayList result = graph.breadthFristSearch(one);
        for(int i = 0; i < expectedOutput.size(); i++){
            Node node = (Node) result.get(i);
            System.out.println(node.label);
            assertEquals(expectedOutput.get(i), result.get(i));
        }


    }

}