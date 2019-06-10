package code401Challenges.stacksandqueues;


public class Stack {
    private Node top;
    private int count;

    public Stack(){
        top = null;
        count = 0;
    }

    //getters

    public Node getTop() {
        return top;
    }

    public int getCount() {
        return count;
    }

    //helper functions

    public boolean isEmpty(){
        return top == null;
    }

    //feature functions

    public void push(int value){
        if(isEmpty() == true){
            top = new Node(value);
            count++;
        } else {
            Node previousTop = top;
            top = new Node(value);
            top.next = previousTop;
            count++;
        }
    }

    public int pop(){
        if(isEmpty() == true) {
            System.out.println("Stack is empty");
        }
        int value = top.value;
        top = top.next;
        count--;
        return value;
    }

    public int peek(){
        if(isEmpty() == true){
            System.out.println("Stack is empty");
        }
        return top.value;
    }
}
