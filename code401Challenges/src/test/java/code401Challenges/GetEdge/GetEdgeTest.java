package code401Challenges.GetEdge;

import code401Challenges.Graph.Graph;
import code401Challenges.Graph.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void testGetGraph(){
        GetEdge test = new GetEdge();
        Graph graph = new Graph();
        Node kingsLanding = graph.addNode("Kings Landing");
        Node winterfell = graph.addNode("Winterfell");
        Node casterlyRock = graph.addNode("Casterly Rock");
        Node bearIsland = graph.addNode("Bear Island");
        Node whiteHarbor = graph.addNode("White Harbor");
        Node lannisport = graph.addNode("Lannisport");
        Node tartbeckHall = graph.addNode("Tarbeck Hall");

        kingsLanding.addNeighbor(winterfell, 100);
        kingsLanding.addNeighbor(casterlyRock, 200);
        winterfell.addNeighbor(bearIsland, 75);
        winterfell.addNeighbor(whiteHarbor, 75);
        casterlyRock.addNeighbor(lannisport, 50);
        casterlyRock.addNeighbor(tartbeckHall, 50);

        String[] testArr = new String[]{"Kings Landing", "Winterfell", "White Harbor"};

        GetEdge expectedOutput = new GetEdge(true, 175);
        assertEquals(expectedOutput.output, test.directFlights(graph, testArr).output);
        assertEquals(expectedOutput.cost, test.directFlights(graph, testArr).cost);
    }

    @Test
    public void testFailGraph(){
        GetEdge test = new GetEdge();
        Graph graph = new Graph();
        Node kingsLanding = graph.addNode("Kings Landing");
        Node winterfell = graph.addNode("Winterfell");
        Node casterlyRock = graph.addNode("Casterly Rock");
        Node bearIsland = graph.addNode("Bear Island");
        Node whiteHarbor = graph.addNode("White Harbor");
        Node lannisport = graph.addNode("Lannisport");
        Node tartbeckHall = graph.addNode("Tarbeck Hall");

        kingsLanding.addNeighbor(winterfell, 100);
        kingsLanding.addNeighbor(casterlyRock, 200);
        winterfell.addNeighbor(bearIsland, 75);
        winterfell.addNeighbor(whiteHarbor, 75);
        casterlyRock.addNeighbor(lannisport, 50);
        casterlyRock.addNeighbor(tartbeckHall, 50);

        String[] testArr = new String[]{"Kings Landing", "Winterfell", "Lannisport"};

        GetEdge expectedOutput = new GetEdge(false, 0);
        assertEquals(expectedOutput.output, test.directFlights(graph, testArr).output);
        assertEquals(expectedOutput.cost, test.directFlights(graph, testArr).cost);
    }

    @Test
    public void testEmptyGraph(){
        GetEdge test = new GetEdge();
        Graph graph = new Graph();
        String[] testArr = new String[]{"Kings Landing", "Winterfell", "White Harbor"};
        GetEdge expectedOutput = new GetEdge(false, 0);
        assertEquals(expectedOutput.output, test.directFlights(graph, testArr).output);
        assertEquals(expectedOutput.cost, test.directFlights(graph, testArr).cost);
    }

}