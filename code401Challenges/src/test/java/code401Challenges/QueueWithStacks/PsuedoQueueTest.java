package code401Challenges.QueueWithStacks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PsuedoQueueTest {

    @Test
    public void testConstructor(){
    PsuedoQueue p = new PsuedoQueue();
    assertTrue("should be null", p.stackOne.peek() == null);
    assertTrue("should be null", p.stackTwo.peek() == null);
    }

    @Test
    public void testEnque_singleValue(){
        PsuedoQueue p = new PsuedoQueue();
        p.enqueue(5);
        assertEquals("should return 5",  5, p.stackOne.peek());
    }

    @Test
    public void testDequeue_singleValue(){
        PsuedoQueue p = new PsuedoQueue();
        p.enqueue(5);
        assertEquals("should return null", 5, p.dequeue());
    }

    @Test
    public void testEnqueue_and_deque_multipleValues(){
        PsuedoQueue p = new PsuedoQueue();
        p.enqueue(5);
        p.enqueue(10);
        p.enqueue(15);
        p.enqueue(20);
        assertEquals("should return 5", 5, p.dequeue());
        assertEquals("should return 10", 10,  p.dequeue());
        assertEquals("should return 15", 15, p.dequeue());
        assertEquals("should return 20l", 20, p.dequeue());
        assertTrue("should return null", p.dequeue() == null);
    }



}