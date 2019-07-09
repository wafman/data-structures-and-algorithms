package code401Challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;


public class HashtableTest {

    @Test
    public void testHash(){
        Hashtable hashtable = new Hashtable(31);
        int hashKeyTest = hashtable.hash("test");
        assertEquals(24, hashKeyTest);
    }

    @Test
    public void testEmptyGet(){
        Hashtable hashtable = new Hashtable(1);
        assertNull(hashtable.get("test"));
    }

    @Test
    public void testAdd_Single(){
        Hashtable hashtable = new Hashtable(1);
        hashtable.add("Test1", "test1");
        String expectedOutput = "test1";
        assertTrue(hashtable.get("Test1").equals(expectedOutput));
    }

    @Test
    public void testAdd_Multiples(){
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("Test1", "test1");
        hashtable.add("Test2", "test2");
        hashtable.add("Test3", "test3");
        String expectedOutput = "test3";
        assertTrue(hashtable.get("Test3").equals(expectedOutput));
    }

    @Test
    public void testContains_False(){
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("Test1", "test1");
        assertFalse(hashtable.contains("Test2"));
    }

    @Test
    public void testContains_single(){
        Hashtable hashtable = new Hashtable(1);
        hashtable.add("Test1", "test1");
        assertTrue(hashtable.contains("Test1"));
    }

    @Test
    public void testContains_multiples(){
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("Test1", "test1");
        hashtable.add("Test2", "test2");
        hashtable.add("Test3", "test3");
        assertTrue(hashtable.contains("Test3"));
    }

}