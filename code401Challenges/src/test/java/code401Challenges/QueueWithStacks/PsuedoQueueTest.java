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
        assertTrue("should return 5",  p.stackOne.peek() == 5);
    }

//    @Test
//    public void testEnqueue_multipleValues(){
//        PsuedoQueue p = new PsuedoQueue();
//        p.enqueue(5);
//        p.enqueue(10);
//        p.enqueue(15);
//        assertTrue("should return 3", );
//    }

}