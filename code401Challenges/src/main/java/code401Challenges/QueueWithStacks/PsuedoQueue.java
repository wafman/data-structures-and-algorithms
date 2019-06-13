package code401Challenges.QueueWithStacks;


import code401Challenges.stacksandqueues.Stack;

public class PsuedoQueue<T> {
    Stack<T> stackOne;
    Stack<T> stackTwo;

    //constructor
    public PsuedoQueue(){
        this.stackOne = new Stack();
        this.stackTwo = new Stack();
    }

    //add values to the queue using the stack instances
    public void enqueue(T value){
        if(stackOne.isEmpty()){
            stackOne.push(value);
        } else {
            while(stackOne.peek() != null){
                stackTwo.push(stackOne.pop());
            }
            stackOne.push(value);
            while(stackTwo.peek() != null){
                stackOne.push(stackTwo.pop());
            }
        }
    }

    //remove first node from queue using stack instance
    public T dequeue(){
        if(stackOne.peek() == null){
            return null;
        } else {
            return stackOne.pop();
        }
    }

}
