package code401Challenges.QueueWithStacks;


import code401Challenges.stacksandqueues.Stack;

public class PsuedoQueue {
    Stack stackOne;
    Stack stackTwo;

    public PsuedoQueue(){
        this.stackOne = new Stack();
        this.stackTwo = new Stack();
    }

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

    public Integer dequeue(){
        if(stackOne.peek() == null){
            return null;
        } else {
            return stackOne.pop();
        }
    }

}
