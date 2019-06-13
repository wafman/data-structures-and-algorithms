package code401Challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testIsEmpty(){
        Stack stack = new Stack();
        assertTrue("should return true", stack.isEmpty());
    }

    @Test
    public void testPush_singleValue(){
        Stack stack = new Stack();
        stack.push(5);
        assertEquals("top should return 5", 5, stack.getTop().value);
    }

    @Test
    public void testPush_multipleValues(){
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        assertTrue("count should return 3", stack.getCount() == 3);
    }

    @Test
    public void testPop_singleValue(){
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.pop();
        assertEquals("should return 5", 5, stack.getTop().value);
    }

    @Test
    public void testPop_multipleValuesToMakeEmpty(){
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue("should return true", stack.isEmpty());
    }

    @Test
    public void testPeek(){
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        assertEquals("should return 10",  10, stack.peek());
    }

}