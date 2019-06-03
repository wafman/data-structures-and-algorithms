package code401Challenges.linkedlist;

import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testIsEmpty(){
        LinkedList classUnderTest = new LinkedList();
        assertTrue(classUnderTest.isEmpty());
    }

    @Test
    public void testInsert(){
        LinkedList classUnderTest = new LinkedList();
        int num = 15;
        classUnderTest.insert(num);
        assertTrue(classUnderTest.head.data ==15);
    }

    @Test
    public void testIncludes_True(){
        LinkedList classUnderTest = new LinkedList();
        int num = 15;
        classUnderTest.insert(15);
        classUnderTest.insert(10);
        classUnderTest.insert(5);
        assertTrue(classUnderTest.includes(num));
    }

    @Test
    public void testIncludes_False(){
        LinkedList classUnderTest = new LinkedList();
        int num = 15;
        classUnderTest.insert(10);
        classUnderTest.insert(20);
        classUnderTest.insert(30);
        assertFalse(classUnderTest.includes(num));
    }

    @Test
    public void testPrint(){
        LinkedList classUnderTest = new LinkedList();
        int num = 15;
        classUnderTest.insert(15);
        classUnderTest.insert(20);
        classUnderTest.insert(25);
        String expectedOutput = "25\n" +
                "20\n" +
                "15\n" +
                "null";
        assertEquals(expectedOutput, classUnderTest.print());
    }

}