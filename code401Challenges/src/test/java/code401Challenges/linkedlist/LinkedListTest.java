package code401Challenges.linkedlist;

import org.junit.Test;


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

    @Test
    public void testAppend(){
        LinkedList classUnderTest = new LinkedList();
        int num = 10;
        classUnderTest.insert(15);
        classUnderTest.insert(20);
        classUnderTest.insert(25);
        classUnderTest.append(num);
        String expectedOutput = "25\n" +
                "20\n" +
                "15\n" +
                "10\n" +
                "null";
        assertEquals(expectedOutput, classUnderTest.print());
    }

    @Test
    public void testInsertBefore(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertBefore(3,5);
        String expectedOutput = "1\n" +
                "5\n" +
                "3\n" +
                "2\n" +
                "null";
        assertEquals(expectedOutput, classUnderTest.print());
    }

    @Test
    public void testInsertAfter(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(3,5);
        String expectedOutput = "1\n" +
                "3\n" +
                "5\n" +
                "2\n" +
                "null";
        assertEquals(expectedOutput, classUnderTest.print());
    }

    @Test
    public void testInsertAfter_multiples(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(3,5);
        classUnderTest.insertAfter(2,5);
        String expectedOutput = "1\n" +
                "3\n" +
                "5\n" +
                "2\n" +
                "5\n" +
                "null";
        assertEquals(expectedOutput, classUnderTest.print());
    }

    @Test
    public void testInsertAfter_finalValueNode(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        classUnderTest.insertAfter(2,5);
        String expectedOutput = "1\n" +
                "3\n" +
                "2\n" +
                "5\n" +
                "null";
        assertEquals(expectedOutput, classUnderTest.print());
    }

    @Test
    public void testReturnNFromEnd_begginingOfList(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(8);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        int expectedOutput = 2;
        assertEquals("function should return 0th number(2) node data from the end of the linked list",
                expectedOutput,
                classUnderTest.returnNfromEnd(0));
    }

    @Test
    public void testReturnNFromEnd_EndOfList(){
        LinkedList classUnderTest = new LinkedList();
        classUnderTest.insert(2);
        classUnderTest.insert(8);
        classUnderTest.insert(3);
        classUnderTest.insert(1);
        int expectedOutput = 3;
        assertEquals("function should return 2nd number (3) from end of linked list",
                expectedOutput,
                classUnderTest.returnNfromEnd(2));
    }

    @Test (expected = NullPointerException.class)
    public void testReturnNFromEnd_emptyLinkedList(){
        LinkedList classUnderTest = new LinkedList();
        assertNull("should return null", classUnderTest.returnNfromEnd(0));
    }

    @Test
    public void testMergeList(){
        LinkedList classUnderTest = new LinkedList();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        a.insert(2);
        a.insert(3);
        a.insert(1);
        b.insert(4);
        b.insert(9);
        b.insert(5);
        LinkedList.mergeLists(a,b);
        String expectedOutput = "1\n" +
                "5\n" +
                "3\n" +
                "9\n" +
                "2\n" +
                "4\n" +
                "null";
        assertEquals("should return a joined linked list", expectedOutput,
                a.print());
    }

    @Test
    public void testMergeList_1stListUneven(){
        LinkedList classUnderTest = new LinkedList();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        a.insert(3);
        a.insert(1);
        b.insert(4);
        b.insert(9);
        b.insert(5);
        LinkedList.mergeLists(a,b);
        String expectedOutput = "1\n" +
                "5\n" +
                "3\n" +
                "9\n" +
                "4\n" +
                "null";
        assertEquals("should return a joined linked list", expectedOutput,
                a.print());
    }

    @Test
    public void testMergeList_2ndListUneven(){
        LinkedList classUnderTest = new LinkedList();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        a.insert(2);
        a.insert(3);
        a.insert(1);
        b.insert(9);
        b.insert(5);
        LinkedList.mergeLists(a,b);
        String expectedOutput = "1\n" +
                "5\n" +
                "3\n" +
                "9\n" +
                "2\n" +
                "null";
        assertEquals("should return a joined linked list", expectedOutput,
                a.print());
    }

}// end of testing class