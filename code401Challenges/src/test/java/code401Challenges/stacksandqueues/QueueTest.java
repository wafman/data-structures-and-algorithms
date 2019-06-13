package code401Challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testIsEmpty(){
        Queue queue = new Queue();
        assertTrue("should return true", queue.isEmpty());
    }

    @Test
    public void testEnqueue_singleValue(){
        Queue queue = new Queue();
        queue.enqueue(5);
        assertEquals("should return 5", 5, queue.getFront().value);
    }

    @Test
    public void testEnqueue_multipleValues(){
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        assertTrue("size should be 3", queue.getCount() == 3);
    }

    @Test
    public void testDequeue_singleValue(){
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        assertEquals("should return 10", 5, queue.dequeue());
    }

    @Test
    public void testDequeue_multipleValues(){
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertTrue("should return truee", queue.isEmpty());
    }

    @Test
    public void testPeek(){
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        assertEquals("should return 5", 5, queue.peek());
    }

}