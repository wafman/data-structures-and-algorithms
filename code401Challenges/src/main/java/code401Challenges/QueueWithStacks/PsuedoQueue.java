package code401Challenges.QueueWithStacks;


import code401Challenges.stacksandqueues.Stack;

public class PsuedoQueue {
    Stack stackOne;
    Stack stackTwo;

    //constructor
    public PsuedoQueue(){
        this.stackOne = new Stack();
        this.stackTwo = new Stack();
    }

    //add values to the queue using the stack instances
    public void enqueue(int value){
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
    public Integer dequeue(){
        if(stackOne.peek() == null){
            return null;
        } else {
            return stackOne.pop();
        }
    }

}
